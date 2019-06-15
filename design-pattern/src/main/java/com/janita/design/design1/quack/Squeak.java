package com.janita.design.design1.quack;

import com.janita.design.design1.quack.QuackBehavior;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-15 - 23:24
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
