package com.janita.design.c4工厂模式;

/**
 * 类说明：披萨店框架
 *
 * @author zhucj
 * @since 2019-07-19 - 16:33
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
