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

    private Properties properties = new Properties();

    private List<String> classNames = new ArrayList<>();

    private Map<String, Object> ioc = new HashMap<>();

    private Map<String, Method> handlerMapping = new HashMap<>();

    private Map<String, Object> controllerMap = new HashMap<>();

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
        if (handlerMapping.isEmpty()) {
            return;
        }
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        url = url.replace(contextPath, "").replaceAll("/+", "/");
        if (!this.handlerMapping.containsKey(url)) {
            resp.getWriter().write("404 NOT FOUND!");
            return;
        }
        Method method = this.handlerMapping.get(url);
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
                    String value = Arrays.toString(paramValue).replaceAll("\\[|]", "").replaceAll(",\\s", ",");
                    paramValues[i++] = value;
                }
            }
        }
        // 利用反射机制来调用
        try {
            // 第一个参数是method所对应的实例
            // 在ioc容器中
            method.invoke(this.controllerMap.get(url), paramValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    private void doScanner(String packageName) {
        // 把所有的.替换成/
        URL url = this.getClass().getClassLoader().getResource("/" + packageName.replaceAll("\\.", "/"));
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
                classNames.add(className);
            }
        }
    }

    private void doInstance() {
        if (classNames.isEmpty()) {
            return;
        }
        for (String className : classNames) {
            try {
                // 把类搞出来,反射来实例化(只有加@MyController需要实例化)
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(LPController.class)) {
                    ioc.put(toLowerFirstWord(clazz.getSimpleName()), clazz.newInstance());
                } else if (clazz.isAnnotationPresent(LPService.class)) {
                    Object instance = clazz.newInstance();
                    LPService service = clazz.getAnnotation(LPService.class);
                    String key = service.value();
                    ioc.put(key, instance);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initHandlerMapping() {
        if (ioc.isEmpty()) {
            return;
        }
        try {
            for (Entry<String, Object> entry : ioc.entrySet()) {
                Class<?> clazz = entry.getValue().getClass();
                if (!clazz.isAnnotationPresent(LPController.class)) {
                    continue;
                }
                Object instance = entry.getValue();
                // 拼url时,是controller头的url拼上方法上的url
                String baseUrl = "";
                if (clazz.isAnnotationPresent(LPRequestMapping.class)) {
                    LPRequestMapping annotation = clazz.getAnnotation(LPRequestMapping.class);
                    baseUrl = annotation.value();
                }
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (!method.isAnnotationPresent(LPRequestMapping.class)) {
                        continue;
                    }
                    LPRequestMapping annotation = method.getAnnotation(LPRequestMapping.class);
                    String url = annotation.value();

                    url = (baseUrl + "/" + url).replaceAll("/+", "/");
                    handlerMapping.put(url, method);
                    controllerMap.put(url, instance);
                    System.out.println(url + "," + method);
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
        if (ioc.isEmpty()) {
            return;
        }
        // 遍历所有被托管的对象
        for (Map.Entry<String, Object> entry : ioc.entrySet()) {
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
                if ("".equals(autowired.value())) {
                    // 例 searchService。注意，此处是获取属性的类名的首字母小写，与属性名无关，可以定义@Autowired
                    // SearchService abc都可以。
                    beanName = toLowerFirstWord(field.getType().getSimpleName());
                } else {
                    beanName = autowired.value();
                }
                // 将私有化的属性设为true,不然访问不到
                field.setAccessible(true);
                // 去映射中找是否存在该beanName对应的实例对象
                if (ioc.get(beanName) != null) {
                    try {
                        field.set(instance, ioc.get(beanName));
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