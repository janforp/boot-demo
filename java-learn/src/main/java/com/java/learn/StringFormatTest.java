package com.java.learn;

import java.text.MessageFormat;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 17:00
 */
public class StringFormatTest {

    public static void main(String[] args) {
        String ret = MessageFormat.format("{0}/{1}/trace/tracer.log", "/usr/local/logs", "hermes");
        System.out.println(ret);
    }
}
