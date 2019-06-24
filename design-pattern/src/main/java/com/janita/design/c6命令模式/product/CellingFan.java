package com.janita.design.c6命令模式.product;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:45
 */
public class CellingFan {

    private String name;

    public CellingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("CellingFan " + name + " is on");

    }

    public void off() {
        System.out.println("CellingFan " + name + " is off");

    }
}
