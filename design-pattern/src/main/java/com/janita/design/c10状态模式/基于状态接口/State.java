package com.janita.design.c10状态模式.基于状态接口;

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
