package com.manual.mvc.dispatch;


import com.manual.mvc.annotation.LPAutowired;
import com.manual.mvc.annotation.LPController;
import com.manual.mvc.annotation.LPRequestMapping;
import com.manual.mvc.annotation.LPService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.manual.mvc.utils.AssertUtils.assertNotNull;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-07-29 - 16:15
 */
public class ManualDispatchServlet extends HttpServlet {

    @SuppressWarnings("all")
    private static final String REG = "\\[|]";

    /**
     * 配置文件
     */
    private Properties properties = new Properties();

    /**
     * 用于保存扫描包路径下的所有类的全路径名称
     */
    private List<String> allClassNameInScanPackage = new ArrayList<>();

    /**
     * key:bean的全路径名称，value：该bean的唯一实例
     */
    private Map<String, Object> beanNameToInstanceIocContainer = new HashMap<>();

    /**
     * key：url，value：对应controller实例
     */
    private Map<String, Object> urlControllerMap = new HashMap<>();

    /**
     * key:url,value:对应该路径的处理方法，当然是某个controller中的方法
     */
    private Map<String, Method> handlerMethodMapping = new HashMap<>();


    @Override
    public void init(ServletConfig config) {
        // 1.加载配置文件
        doLoadConfig(config.getInitParameter("contextConfigLocation"));
        // 2.初始化所有相关联的类,扫描用户设定的包下面所有的类
        doScanner(properties.getProperty("scanPackage"));
        // 3.拿到扫描到的类,通过反射机制,实例化,并且放到ioc容器中(k-v beanName-bean) beanName默认是首字母小写
        doInstance();
        // 4.初始化HandlerMapping(将url和method对应上)
        initHandlerMapping();
        // 5。属性注入
        doAutoWired();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doGet");
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doPost");
        if (handlerMethodMapping.isEmpty()) {
            return;
        }
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        url = url.replace(contextPath, "").replaceAll("/+", "/");
        if (!this.handlerMethodMapping.containsKey(url)) {
            resp.getWriter().write("404 NOT FOUND!");
            return;
        }
        Method method = this.handlerMethodMapping.get(url);
        // 获取方法的参数列表
        Class<?>[] parameterTypes = method.getParameterTypes();
        // 获取请求的参数
        Map<String, String[]> parameterMap = req.getParameterMap();
        // 保存参数值
        Object[] paramValues = new Object[parameterTypes.length];
        // 方法的参数列表
        for (int i = 0; i < parameterTypes.length; i++) {
            // 根据参数名称，做某些处理
            String requestParam = parameterTypes[i].getSimpleName();
            if ("HttpServletRequest".equals(requestParam)) {
                // 参数类型已明确，这边强转类型
                paramValues[i] = req;
                continue;
            }
            if ("HttpServletResponse".equals(requestParam)) {
                paramValues[i] = resp;
                continue;
            }
            if ("String".equals(requestParam)) {
                for (Entry<String, String[]> param : parameterMap.entrySet()) {
                    String[] paramValue = param.getValue();
                    String value = Arrays.toString(paramValue).replaceAll(REG, "").replaceAll(",\\s", ",");
                    paramValues[i++] = value;
                }
            }
        }
        // 利用反射机制来调用
        try {
            // 第一个参数是method所对应的实例
            // 在ioc容器中
            method.invoke(this.urlControllerMap.get(url), paramValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载配置文件，把配置文件的 key -value 加载到 properties
     *
     * @param location 配置文件的路径
     */
    private void doLoadConfig(String location) {
        // 把web.xml中的contextConfigLocation对应value值的文件加载到流里面
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(location);
        try {
            // 用Properties文件加载文件里的内容
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关流
            if (null != resourceAsStream) {
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 扫描配置的包路径，并且把所有的类的全路径名称都放到 <link @allClassNameInScanPackage> 列表中
     *
     * @param packageName 包路径
     */
    private void doScanner(String packageName) {
        // 把所有的.替换成/
        String fileUrl = "/" + packageName.replaceAll("\\.", "/");
        URL url = this.getClass().getClassLoader().getResource(fileUrl);
        assertNotNull(url, "url");
        File dir = new File(url.getFile());
        assertNotNull(dir, "dir");
        File[] files = dir.listFiles();
        assertNotNull(files, "dir");
        for (File file : files) {
            if (file.isDirectory()) {
                // 递归读取包
                doScanner(packageName + "." + file.getName());
            } else {
                String className = packageName + "." + file.getName().replace(".class", "");
                allClassNameInScanPackage.add(className);
            }
        }
    }

    /**
     * 实例化列表 allClassNameInScanPackage 中的bean，只实例化 带有标注 LPController 以及 LPService 的类，并把他们放到容器 beanNameToInstanceIocContainer 中
     */
    private void doInstance() {
        if (allClassNameInScanPackage.isEmpty()) {
            return;
        }
        for (String className : allClassNameInScanPackage) {
            try {
                // 把类搞出来,反射来实例化(只有加@MyController需要实例化)
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(LPController.class)) {
                    String iocKey = toLowerFirstWord(clazz.getSimpleName());
                    Object instance = clazz.newInstance();
                    beanNameToInstanceIocContainer.put(iocKey, instance);
                } else if (clazz.isAnnotationPresent(LPService.class)) {
                    Object instance = clazz.newInstance();
                    LPService service = clazz.getAnnotation(LPService.class);
                    String key = service.value();
                    beanNameToInstanceIocContainer.put(key, instance);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initHandlerMapping() {
        if (beanNameToInstanceIocContainer.isEmpty()) {
            return;
        }
        try {
            for (Entry<String, Object> entry : beanNameToInstanceIocContainer.entrySet()) {
                Class<?> clazz = entry.getValue().getClass();
                if (!clazz.isAnnotationPresent(LPController.class)) {
                    continue;
                }
                Object controllerInstance = entry.getValue();
                // 拼url时,是controller头的url拼上方法上的url
                String baseUrlInClass = "";
                if (clazz.isAnnotationPresent(LPRequestMapping.class)) {
                    LPRequestMapping annotation = clazz.getAnnotation(LPRequestMapping.class);
                    baseUrlInClass = annotation.value();
                }
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (!method.isAnnotationPresent(LPRequestMapping.class)) {
                        continue;
                    }
                    LPRequestMapping annotation = method.getAnnotation(LPRequestMapping.class);
                    String methodUrl = annotation.value();
                    String totalUrl = (baseUrlInClass + "/" + methodUrl).replaceAll("/+", "/");
                    urlControllerMap.put(totalUrl, controllerInstance);
                    handlerMethodMapping.put(totalUrl, method);
                    System.out.println(totalUrl + "," + method);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 给被AutoWired注解的属性注入值
     */
    private void doAutoWired() {
        if (beanNameToInstanceIocContainer.isEmpty()) {
            return;
        }
        // 遍历所有被托管的对象
        for (Map.Entry<String, Object> entry : beanNameToInstanceIocContainer.entrySet()) {
            // 查找所有被Autowired注解的属性
            // getFields()获得某个类的所有的公共（public）的字段，包括父类;
            // getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
            Object instance = entry.getValue();
            Field[] fields = entry.getValue().getClass().getDeclaredFields();
            for (Field field : fields) {
                // 没加autowired的不需要注值
                if (!field.isAnnotationPresent(LPAutowired.class)) {
                    continue;
                }
                String beanName;
                // 获取AutoWired上面写的值，譬如@Autowired("abc")
                LPAutowired autowired = field.getAnnotation(LPAutowired.class);
                String autowiredValue = autowired.value();
                if ("".equals(autowiredValue)) {
                    // 例 searchService。注意，此处是获取属性的类名的首字母小写，与属性名无关，可以定义@Autowired
                    // SearchService abc都可以。
                    String simpleName = field.getType().getSimpleName();
                    beanName = toLowerFirstWord(simpleName);
                } else {
                    beanName = autowiredValue;
                }
                // 将私有化的属性设为true,不然访问不到
                field.setAccessible(true);
                // 去映射中找是否存在该beanName对应的实例对象
                if (beanNameToInstanceIocContainer.get(beanName) != null) {
                    try {
                        field.set(instance, beanNameToInstanceIocContainer.get(beanName));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 把字符串的首字母小写
     */
    private String toLowerFirstWord(String name) {
        char[] charArray = name.toCharArray();
        charArray[0] += 32;
        return String.valueOf(charArray);
    }
}