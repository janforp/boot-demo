package com.janita.design.design1.duck;

import com.janita.design.design1.duck.Duck;
import com.janita.design.design1.fly.FlySwings;
import com.janita.design.design1.quack.Quack;

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
