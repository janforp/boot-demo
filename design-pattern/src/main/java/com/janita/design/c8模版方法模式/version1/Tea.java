package com.janita.design.c8模版方法模式.version1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaTag();
        pourInCup();
        addLemon();
    }


    public void steepTeaTag() {
        System.out.println("把茶袋放进去");
    }

    public void addLemon() {
        System.out.println("添加柠檬");
    }
}
