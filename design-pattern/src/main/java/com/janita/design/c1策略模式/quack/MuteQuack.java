package com.janita.design.c1策略模式.quack;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:23
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
