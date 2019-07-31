package com.java.learn.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 20:37
 */
public class MapKeyTest {

    public static void main(String[] args) {
        WrongUserKey key = new WrongUserKey();
        key.setUserId("1");
        key.setUsername("姓名1");


        WrongUserKey key1 = new WrongUserKey();
        key1.setUserId("1");
        key1.setUsername("姓名1");

        Map<WrongUserKey, String> map = new HashMap<WrongUserKey, String>();
        map.put(key, key.getUsername());
        map.put(key1, key1.getUsername());

        System.out.println(map.size());
    }
}
