package com.janita.design.c10状态模式.基于状态接口;

import lombok.Getter;
import lombok.Setter;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 11:32
 */
public class GumballMachineBaseState {

    @Setter
    private State state;

    @Getter
    private State soldOutState;

    @Getter
    private State noQuarterState;

    @Getter
    private State hasQuarterState;

    @Getter
    private State soldState;

    @Getter
    private int count = 0;

    public GumballMachineBaseState(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.state = soldOutState;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    void insertQuarter() {
        state.insertQuarter();
    }

    void ejectQuarter() {
        state.ejectQuarter();
    }

    void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        print("A gumball rolling out the slot...");
        if (count != 0) {
            count --;
        }
    }
}
