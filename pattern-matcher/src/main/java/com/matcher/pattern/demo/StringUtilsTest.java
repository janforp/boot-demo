package com.matcher.pattern.demo;

import com.boot.demo.common.model.UserDto;

import java.util.List;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/22 - 上午10:31
 */
public class StringUtilsTest {


    public static void main(String[] args) {

        List<UserDto> list = UserDto.list();
        list.forEach(userDto -> {
            if (userDto.getUserId().equals("1")) {
                return;
            }
            System.out.println(userDto);
        });
    }
}
