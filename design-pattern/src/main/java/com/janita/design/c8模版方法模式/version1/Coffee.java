package com.janita.design.c8模版方法模式.version1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSurgeAndMilk();
    }


    public void brewCoffeeGrinds() {
        System.out.println("研磨咖啡豆");
    }

    public void addSurgeAndMilk() {
        System.out.println("添加牛奶和糖");
    }
}
