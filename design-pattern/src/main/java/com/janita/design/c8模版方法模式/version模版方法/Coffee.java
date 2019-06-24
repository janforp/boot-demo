package com.janita.design.c8模版方法模式.version模版方法;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 19:25
 */
public class Coffee extends CaffeineBeverageWithHook {

    @Override
    void brew() {

        System.out.println("浸泡茶叶");
    }

    @Override
    void addCondiments() {
        System.out.println("添加柠檬");
    }
}
