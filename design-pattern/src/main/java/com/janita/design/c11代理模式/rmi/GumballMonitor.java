package com.janita.design.c11代理模式.rmi;

import com.janita.design.c11代理模式.糖果机.GumballMachineBaseState;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 20:26
 */
public class GumballMonitor {

    private GumballMachineBaseState machine;

    public GumballMonitor(GumballMachineBaseState machine) {
        this.machine = machine;
    }

    public void report() {
        print("Gumball Machine：" + machine.getLocationCode());
        print("Current inventory：" + machine.getCount() + " 个糖果");
        print("Current state：" + machine.getState());
    }
}
