package com.effective.java.learn.c2创建和销毁对象;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;

/**
 * 类说明：KeySet其实就是一个适配器，用于把map转换成Set接口
 *
 * @author zhucj
 * @since 2019-07-22 - 16:50
 */
public class MapKeySetTest {

    public static void main(String[] args) {
        Map<String, Integer> map = Maps.newHashMap();
        map.put("1", 1);
        map.put("2", 2);
        Set<String> keySet1 = map.keySet();

        map.put("3", 3);
        Set<String> keySet2 = map.keySet();
        System.out.println(keySet1.equals(keySet2));
        System.out.println(keySet1 == keySet2);

        //此处会抛出异常
        keySet2.add("4");

        System.out.println(keySet1);
    }
}
