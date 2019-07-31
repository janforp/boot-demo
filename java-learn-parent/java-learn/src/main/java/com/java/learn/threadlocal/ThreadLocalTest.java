package com.java.learn.threadlocal;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 10:12
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> 0);
        integerThreadLocal.set(2);
        System.out.println(integerThreadLocal.get());

        ThreadLocal<Long> longThreadLocal = ThreadLocal.withInitial(() -> 100L);
        longThreadLocal.set(200L);
        System.out.println(longThreadLocal.get());
    }
}
