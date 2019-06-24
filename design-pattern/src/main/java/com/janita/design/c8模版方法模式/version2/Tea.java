package com.janita.design.c8模版方法模式.version2;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("添加牛奶和糖");
    }
}
