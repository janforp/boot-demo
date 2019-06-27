package com.janita.design.c11代理模式.糖果机;

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

    @Getter
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
    private State winnerState;

    @Getter
    private int count;

    @Getter
    private String locationCode;

    public GumballMachineBaseState(String locationCode, int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.locationCode = locationCode;
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

    @Override
    public String toString() {
        return ("还有" + count + "个糖果" + "，状态是 " + decideSate());
    }

    private String decideSate() {
        if (state instanceof SoldOutState) {
            return "没有糖果了";
        }
        if (state instanceof NoQuarterState) {
            return "没有25美分";
        }
        if (state instanceof HasQuarterState) {
            return "投入了25美分";
        }
        if (state instanceof SoldState) {
            return "正在出糖果";
        }
        return "";
    }

    void refill(int count) {
        this.count = count;
        this.state = noQuarterState;
    }
}
