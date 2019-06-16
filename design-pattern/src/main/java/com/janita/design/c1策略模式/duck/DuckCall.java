package com.janita.design.c1策略模式.duck;

import com.janita.design.c1策略模式.quack.Quack;
import com.janita.design.c1策略模式.quack.QuackBehavior;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 08:54
 */
public class DuckCall {

    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
