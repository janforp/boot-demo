package com.janita.design.c12复合模式;

/**
 * 类说明：为了实现统计一共叫了多少次的功能，使用装饰模式，为鸭子添加新的统计次数的功能
 * <p>
 *     这样有一个问题：如果哪些没有使用装饰者的鸭子的叫声就无法被统计
 * </p>
 * @author zhucj
 * @since 2019-06-28 - 14:51
 */
public class QuackCounter implements Quackable {

    private Quackable duck;

    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        //为鸭子接口提供的新功能==统计叫声的次数
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
