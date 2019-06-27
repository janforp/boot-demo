package com.janita.design.c10状态模式.基于状态接口;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 15:37
 */
public class WinnerState implements State {


    private GumballMachineBaseState machine;

    public WinnerState(GumballMachineBaseState machineBaseState) {
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
      print("YOU'RE A WINNER! You get two gumballs for your quarter");
      machine.releaseBall();
      if (machine.getCount() == 0) {
          machine.setState(machine.getSoldOutState());
      } else {
          machine.releaseBall();
          if (machine.getCount() > 0) {
              machine.setState(machine.getNoQuarterState());
          } else {
              print("Oops, out of gumballs!");
              machine.setState(machine.getSoldOutState());
          }
      }
    }
}
