package com.janita.design.c4工厂模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-19 - 16:36
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".endsWith(type)) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
