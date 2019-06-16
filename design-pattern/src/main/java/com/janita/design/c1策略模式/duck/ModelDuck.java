package com.janita.design.c1策略模式.duck;

import com.janita.design.c1策略模式.fly.FlyOnWay;
import com.janita.design.c1策略模式.quack.Quack;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:29
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyOnWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }
}
