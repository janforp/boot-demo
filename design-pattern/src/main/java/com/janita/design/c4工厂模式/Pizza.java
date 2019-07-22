package com.janita.design.c4工厂模式;

import java.util.ArrayList;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-19 - 16:32
 */
public abstract class Pizza {

    String name;

    String dough;

    String sauce;

    ArrayList toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Preparing " + name);
        System.out.println("Preparing " + name);

    }

    abstract void bake();

    abstract void cut();

    abstract void box();
}
