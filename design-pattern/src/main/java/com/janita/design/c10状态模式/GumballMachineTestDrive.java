package com.janita.design.c10状态模式;

import static com.boot.demo.common.util.CommonUtils.print;
import static com.boot.demo.common.util.CommonUtils.printSep;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 14:24
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine g = new GumballMachine(5);
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
