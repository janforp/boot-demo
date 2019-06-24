package com.janita.design.c8模版方法模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 20:49
 */
public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperator1();
        primitiveOperator2();
        concreteOperator();
        hook();
    }

    abstract void primitiveOperator1();

    abstract void primitiveOperator2();

    final void concreteOperator() {
        //实现
    }

    void hook() {}

}
