package com.java.learn.event;

import java.util.Arrays;
import java.util.EventObject;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-05-30 - 15:54
 */
public class BirthEvent extends EventObject {


    private Birther birther;

    public BirthEvent(Birther birther) {
        super(birther);
        this.birther = birther;
    }


    public static void main(String[] args) {
        char[] chars = new char[] {'1','2', '3'};
        char[] copyOf = Arrays.copyOf(chars, chars.length);
        System.out.println(new String(copyOf, 1, 1));
    }

}
