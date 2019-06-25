package com.janita.design.c8模版方法模式.version模版方法;

import java.util.Arrays;

/**
 * 类说明：模版方法模式
 * <p>
 * 模版方法模式在以恶搞方法中定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重现定义算法中的某些步骤
 * </p>
 *
 * @author zhucj
 * @since 2019-06-24 - 19:32
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * 这个就是吊吊的模版方法
     * <p>
     * 封装了算法模版
     * </p>
     * <p>
     * 模版方法定义了一个算法的步骤，并允许子类为一个或者多个步骤提供实现
     * </p>
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("把水煮沸");
    }

    public void pourInCup() {
        System.out.println("倒进杯子");
    }

    /**
     * 钩子函数，可以影响算法的某些步骤
     * <p>
     * 当算法中的某个步骤是可选的，那么就交给子类去选择吧，子类通过复写钩子函数就可以进行自己的选择
     * </p>
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
