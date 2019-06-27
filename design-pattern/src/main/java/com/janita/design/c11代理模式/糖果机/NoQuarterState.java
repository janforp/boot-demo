package com.janita.design.c11代理模式.糖果机;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:37
 */
public class NoQuarterState implements State {

    private GumballMachineBaseState machine;

    public NoQuarterState(GumballMachineBaseState machineBaseState) {
        this.machine = machineBaseState;
    }

    @Override
    public void insertQuarter() {
        print("You inserted a quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        print("Your haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        print("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        print("You need to pay first");
    }
}
