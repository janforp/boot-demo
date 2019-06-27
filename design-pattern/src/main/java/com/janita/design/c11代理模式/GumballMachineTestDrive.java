package com.janita.design.c11代理模式;

import com.janita.design.c11代理模式.糖果机.GumballMachineBaseState;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 20:34
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineBaseState machine = new GumballMachineBaseState("sdf", 12);

        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();
    }
}
