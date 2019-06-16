package com.janita.design.c1策略模式.test;

import com.janita.design.c1策略模式.duck.Duck;
import com.janita.design.c1策略模式.duck.ModelDuck;
import com.janita.design.c1策略模式.fly.FlyRocketPowered;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:26
 */
public class MiniDuckSimulator2 {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        //支持动态变化行为
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
