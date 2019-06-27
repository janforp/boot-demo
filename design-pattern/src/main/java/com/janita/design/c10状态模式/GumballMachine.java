package com.janita.design.c10状态模式;


import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 11:32
 */
public class GumballMachine {

    private static final int SOLD_OUT = 0;

    private static final int NO_QUARTER = 1;

    private static final int HAS_QUARTER = 2;

    private static final int SOLD = 3;

    /**
     * 这个实力变量跟踪当前状态
     */
    private int state = SOLD_OUT;

    /**
     * 剩余糖果数
     */
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            print("You can't instert another quarter");
            return;
        }
        if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            print("You inserted a quarter");
            return;
        }
        if (state == SOLD_OUT) {
            print("You can't insert a quarter, the mahine is sold out");
            return;
        }
        if (state == SOLD) {
            print("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            print("Quarter returned");
            state = NO_QUARTER;
            return;
        }
        if (state == NO_QUARTER) {
            print("Your haven't inserted a quarter");
            return;
        }
        if (state == SOLD) {
            print("Sorry, you already turned the crank");
            return;
        }
        if (state == SOLD_OUT) {
            print("You can't eject, you haven't inserted a  quarter yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            print("Turning twice doesn't get you another gumball!");
            return;
        }
        if (state == NO_QUARTER){
            print("You turned but there's no quarter");
            return;
        }
        if (state == SOLD_OUT) {
            print("Your turned, but there's no gumball");
            return;
        }
        if (state == HAS_QUARTER) {
            print("Your turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            print("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                print("Oops, out if gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
            return;
        }
        if (state == NO_QUARTER) {
            print("You need to pay first");
            return;
        }
        if (state == HAS_QUARTER) {
            print("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return ("还有" + count + "个糖果" + "，状态是 " + decideSate());
    }

    private String decideSate() {
        if (state == SOLD_OUT) {
            return "没有糖果了";
        }
        if (state == NO_QUARTER) {
            return "没有25美分";
        }
        if (state == HAS_QUARTER) {
            return "投入了25美分";
        }
        if (state == SOLD) {
            return "正在出糖果";
        }
        return "";
    }
}
