package com.java8.demo.lambda;

import com.boot.demo.common.model.UserDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/15 - 下午8:11
 */
public class PeekUtils {

    public static void main(String[] args) {

        List<UserDto> list = UserDto.list();

        list = list.stream().peek(userDto -> userDto.setUserId(userDto.getUserName() + "P")).collect(Collectors.toList());

        System.out.println(list);
    }
}
