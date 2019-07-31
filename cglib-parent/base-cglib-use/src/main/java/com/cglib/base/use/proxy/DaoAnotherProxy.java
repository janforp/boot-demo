package com.cglib.base.use.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 16:03
 */
public class DaoAnotherProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy proxy) throws Throwable {

        System.out.println(method.getName() + "StartTime=[" + System.currentTimeMillis() + "]");
        // method.invoke(object, objects);
        proxy.invokeSuper(object, objects);
        System.out.println(method.getName() + "EndTime=[" + System.currentTimeMillis() + "]");
        return object;
    }

}