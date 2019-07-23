package com.java.learn.util;

import java.util.Arrays;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-23 - 13:23
 */
public class ArraysTest {

    private static void testCopyeOf() {
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Integer[] copy = Arrays.copyOf(integers, 10);
        for (final Integer integer : integers) {
            System.out.println(integer);
        }
        for (final Integer integer : copy) {
            System.out.println(integer);
        }

        System.out.println(integers == copy);
    }

    public static void main(String[] args) {
        testCopyeOf();
    }
}
