package com.janita.design.c1策略模式.duck;

import com.janita.design.c1策略模式.fly.FlySwings;
import com.janita.design.c1策略模式.quack.Quack;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:24
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlySwings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
