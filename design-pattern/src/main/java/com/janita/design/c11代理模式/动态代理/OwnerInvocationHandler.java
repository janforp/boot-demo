package com.janita.design.c11代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 21:58
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
            if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }
            if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                                                   new OwnerInvocationHandler(person));
    }
}
