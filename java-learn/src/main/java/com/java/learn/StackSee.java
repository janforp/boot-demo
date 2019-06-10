package com.java.learn;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-06-09 - 22:10
 */
public class StackSee {

    private static void sout(int a) {
        sout2(a);
    }

    private static void sout2(int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        sout(1);
    }
}
