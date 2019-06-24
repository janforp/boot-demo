package com.janita.design.c6命令模式.product;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 10:22
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("light " + name + " is on");
    }

    public void off() {
        System.out.println("light " + name + " is off");
    }
}
