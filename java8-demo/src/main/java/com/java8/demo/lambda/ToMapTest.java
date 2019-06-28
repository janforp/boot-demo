package com.java8.demo.lambda;

import com.boot.demo.common.model.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-01-31 - 14:15
 */
public class ToMapTest {

    public static void main(String[] args) {
        testToMap();
    }

    private static void test() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4);
        Map<Integer, Integer> integerIntegerMap = Maps.uniqueIndex(integerList, new com.google.common.base.Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer.intValue();
            }
        });
        System.out.println(integerIntegerMap);
    }

    private static void test2() {
        List<Long> lists = Lists.newArrayList(1L, 2L, 3L, 4L);
        Set<Long> set = Sets.newHashSet(lists);
        List<Long> haves = Lists.newArrayList(1L, 2L);
        lists.removeAll(haves);
        System.out.println(lists);
        System.out.println(set);
    }

    private static void testToMap() {
        List<User> users =
            Lists.newArrayList(User.builder().userId(null).userName("李四").build(), User.builder().userId("2").userName("张三").build());
        Map<String, String> map = users.stream().collect(Collectors.toMap(User::getUserId, User::getUserName));
        System.out.println(map);
    }
}
