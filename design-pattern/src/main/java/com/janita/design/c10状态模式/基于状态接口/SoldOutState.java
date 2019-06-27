package com.janita.design.c10状态模式.基于状态接口;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:37
 */
public class SoldOutState implements State{

    private GumballMachineBaseState machine;

    public SoldOutState(GumballMachineBaseState machineBaseState) {
        this.machine = machineBaseState;
    }

    @Override
    public void insertQuarter() {
        print("You can't insert a quarter, the mahine is sold out");
    }

    @Override
    public void ejectQuarter() {
        print("You can't eject, you haven't inserted a  quarter yet");
    }

    @Override
    public void turnCrank() {
        print("Your turned, but there's no gumball");
    }

    @Override
    public void dispense() {
        print("There's no gumballs!");
    }
}
