package com.janita.design.c11代理模式.糖果机;

import java.util.Random;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:37
 */
public class HasQuarterState implements State {

    private GumballMachineBaseState machine;

    private Random randomWinner = new Random(System.currentTimeMillis());

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
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        print("No gumball dispensed");
    }
}
