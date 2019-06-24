package com.janita.design.c7适配器模式.adaptee;

import com.janita.design.c7适配器模式.adaptee.Turkey;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 15:29
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");

    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
