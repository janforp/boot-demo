package com.cglib.base.use.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 15:26
 */
public class DaoProxy implements MethodInterceptor {

    /**
     * <p>
     * intercept方法的参数名并不是原生的参数名，我做了自己的调整，几个参数的含义为：
     * <p>
     * Object表示要进行增强的对象 Method表示拦截的方法 Object[]数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * MethodProxy表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     * </p>
     */
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println(method.getName() + "Before Method Invoke");
        proxy.invokeSuper(object, objects);
        System.out.println(method.getName() + "After Method Invoke");
        return object;
    }

}