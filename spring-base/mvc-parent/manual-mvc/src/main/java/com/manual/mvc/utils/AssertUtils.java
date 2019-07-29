package com.manual.mvc.utils;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 16:32
 */
public class AssertUtils {

    public static <T> void assertNotNull(T t, String msg) {
        if (t == null) {
            throw new NullPointerException(msg + "为空");
        }
    }
}
