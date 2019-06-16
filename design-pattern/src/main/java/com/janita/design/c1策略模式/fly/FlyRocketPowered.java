package com.janita.design.c1策略模式.fly;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:32
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
