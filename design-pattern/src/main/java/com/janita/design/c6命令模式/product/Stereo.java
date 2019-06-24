package com.janita.design.c6命令模式.product;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:37
 */
public class Stereo {

    private int volume;

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "Stereo on");
    }

    public void off() {
        System.out.println(name + "Stereo off");
    }

    public void setCd() {
        System.out.println(name + "Stereo setCd");
    }

    public void setDvd() {
        System.out.println(name + "Stereo setDvd");
    }

    public void setRadio() {
        System.out.println(name + "Stereo setRadio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + "Stereo setVolume = " + this.volume);
    }
}
