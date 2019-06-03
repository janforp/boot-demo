package com.java8.demo.lambda;

import com.boot.demo.common.model.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-01-31 - 14:15
 */
public class ToMapTest {

    public static void main(String[] args) {

        // User user = new User("1", "123", 1, "1231");
        // User user1 = new User("1", "123", 2, "eer");
        //
        // List<User> list = Lists.newArrayList(user, user1);
        // Map<String, User> collect = list.stream().collect(Collectors.toMap(User::getUserId, Function.identity()));
        // System.out.println(collect);
        // test();
        test2();
    }

    private static void test() {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,1,2,3,4);
        Map<Integer, Integer> integerIntegerMap = Maps.uniqueIndex(integerList, new com.google.common.base.Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer.intValue();
            }
        });
        System.out.println(integerIntegerMap);
    }

    private static void test2() {
        List<Long> lists = Lists.newArrayList(1L,2L,3L,4L);
        Set<Long> set = Sets.newHashSet(lists);
        List<Long> haves = Lists.newArrayList(1L,2L);
        lists.removeAll(haves);
        System.out.println(lists);
        System.out.println(set);
    }
}
