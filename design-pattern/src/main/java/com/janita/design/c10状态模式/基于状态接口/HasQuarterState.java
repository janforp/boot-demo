package com.janita.design.c10状态模式.基于状态接口;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:37
 */
public class HasQuarterState implements State {

    private GumballMachineBaseState machine;

    public HasQuarterState(GumballMachineBaseState machineBaseState) {
        this.machine = machineBaseState;
    }

    @Override
    public void insertQuarter() {
        print("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        print("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        print("Your turned...");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        print("No gumball dispensed");
    }
}
