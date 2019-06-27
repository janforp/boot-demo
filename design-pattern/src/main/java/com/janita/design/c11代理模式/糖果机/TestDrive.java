package com.janita.design.c11代理模式.糖果机;

import com.janita.design.c11代理模式.糖果机.GumballMachineBaseState;

import static com.boot.demo.common.util.CommonUtils.print;
import static com.boot.demo.common.util.CommonUtils.printSep;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 17:25
 */
public class TestDrive {

    public static void main(String[] args) {

        GumballMachineBaseState g = new GumballMachineBaseState("大街上", 5);
        print(g);

        printSep();

        g.insertQuarter();
        g.turnCrank();

        print(g);
        printSep();

        g.insertQuarter();
        g.ejectQuarter();
        g.turnCrank();

        print(g);
        printSep();

        g.insertQuarter();
        g.turnCrank();
        g.insertQuarter();
        g.ejectQuarter();

        printSep();
        print(g);

        g.insertQuarter();
        g.insertQuarter();
        g.turnCrank();
        g.insertQuarter();
        g.turnCrank();

        printSep();
        print(g);
    }
}
