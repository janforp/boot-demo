package com.effective.java.learn.c2创建和销毁对象;

/**
 * 类说明：不要过度使用自动装箱
 * <p>优先使用基本类型</p>
 *
 * @author zhucj
 * @since 2019-07-22 - 17:19
 */
public class AutoBoxTest {


    private static void autoBox() {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void noAutoBox() {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 2305843005992468481 10363 2305843005992468481 802
     */
    public static void main(String[] args) {
        //10363
        autoBox();

        //802
        noAutoBox();
    }
}
