package com.janita.design.design1;

import com.janita.design.design1.duck.Duck;
import com.janita.design.design1.duck.MallardDuck;
import com.janita.design.design1.duck.ModelDuck;
import com.janita.design.design1.fly.FlyRocketPowered;

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
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
