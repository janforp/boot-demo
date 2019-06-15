package com.janita.design.design1.duck;

import com.janita.design.design1.fly.FlyBehavior;
import com.janita.design.design1.quack.QuackBehavior;
import lombok.Setter;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:18
 */
public abstract class Duck {

    @Setter
    FlyBehavior flyBehavior;

    @Setter
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
