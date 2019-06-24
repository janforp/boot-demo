package com.janita.design.c7适配器模式.target;

import com.janita.design.c7适配器模式.target.Duck;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 15:31
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
