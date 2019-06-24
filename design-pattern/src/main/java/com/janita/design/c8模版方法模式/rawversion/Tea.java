package com.janita.design.c8模版方法模式.rawversion;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Tea {

    public void prepareRecipe() {
        boilWater();
        steepTeaTag();
        pourInCup();
        addLemon();
    }

    public void boilWater(){
        System.out.println("把水煮沸");
    }

    public void steepTeaTag() {
        System.out.println("把茶袋放进去");
    }

    public void pourInCup() {
        System.out.println("倒进杯子");
    }

    public void addLemon() {
        System.out.println("添加柠檬");
    }
}
