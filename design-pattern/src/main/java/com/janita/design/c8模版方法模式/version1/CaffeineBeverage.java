package com.janita.design.c8模版方法模式.version1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:32
 */
public abstract class CaffeineBeverage {

    abstract void prepareRecipe();

    public void boilWater(){
        System.out.println("把水煮沸");
    }

    public void pourInCup() {
        System.out.println("倒进杯子");
    }

}
