package com.janita.design.c11代理模式.糖果机;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:36
 */
public class SoldState implements State {

    private GumballMachineBaseState machine;

    public SoldState(GumballMachineBaseState machineBaseState) {
        this.machine = machineBaseState;
    }

    @Override
    public void insertQuarter() {
        print("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        print("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        print("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            print("Oops, out if gumballs");
            machine.setState(machine.getSoldOutState());
        }
    }
}
