package com.cglib.api;

import org.springframework.cglib.proxy.CallbackHelper;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.FixedValue;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 17:14
 */
public class ApiTest {

    public static void main(String[] args) {
        // testFixedValue();
        // testInvocationHandler();
        testCallbackFilter();
    }

    private static void testFixedValue() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback((FixedValue) () -> "Hello cglib");
        SampleClass proxy = (SampleClass) enhancer.create();
        System.out.println(proxy.test(null));
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
        System.out.println(proxy.hashCode());
    }


    private static void testInvocationHandler() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback((InvocationHandler) (proxy, method, args) -> {
            if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "hello cglib";
            } else {
                throw new RuntimeException("Do not know what to do");
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
        System.out.println();
        boolean a = Objects.equals("hello cglib", proxy.test(null));
        boolean b = Objects.equals("Hello cglib", proxy.toString());
        System.out.println(a + "***" + b);
    }

    private static void testCallbackFilter() {
        Enhancer enhancer = new Enhancer();
        CallbackHelper callbackHelper = new CallbackHelper(SampleClass.class, new Class[0]) {
            @Override
            protected Object getCallback(Method method) {
                if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                    return (FixedValue) () -> "Hello cglib";
                } else {
                    return NoOp.INSTANCE;
                }
            }
        };
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallbackFilter(callbackHelper);
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        SampleClass proxy = (SampleClass) enhancer.create();
        boolean a = Objects.equals("Hello cglib", proxy.test(null));
        boolean b = Objects.equals("Hello cglib", proxy.toString());
        System.out.println(proxy.hashCode());
    }
}
