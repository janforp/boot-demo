package com.janita.design.c1策略模式.test;

import com.janita.design.c1策略模式.duck.Duck;
import com.janita.design.c1策略模式.duck.MallardDuck;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:26
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
