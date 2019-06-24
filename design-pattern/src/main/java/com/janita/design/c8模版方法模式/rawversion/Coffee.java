package com.janita.design.c8模版方法模式.rawversion;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Coffee{

    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSurgeAndMilk();
    }

    public void boilWater(){
        System.out.println("把水煮沸");
    }

    public void brewCoffeeGrinds() {
        System.out.println("研磨咖啡豆");
    }

    public void pourInCup() {
        System.out.println("倒进杯子");
    }

    public void addSurgeAndMilk() {
        System.out.println("添加牛奶和糖");
    }
}
