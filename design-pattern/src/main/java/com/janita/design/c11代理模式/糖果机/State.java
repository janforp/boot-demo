package com.janita.design.c11代理模式.糖果机;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:35
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
