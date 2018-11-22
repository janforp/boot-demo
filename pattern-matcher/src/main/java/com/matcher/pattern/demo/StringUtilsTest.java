package com.matcher.pattern.demo;

import com.boot.demo.common.model.UserDto;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/22 - 上午10:31
 */
public class StringUtilsTest {


    public static void main1(String[] args) {

        List<UserDto> list = UserDto.list();
        list.forEach(userDto -> {
            if (userDto.getUserId().equals("1")) {
                return;
            }
            System.out.println(userDto);
        });
    }


    public static void main(String[] args) {
        String[] specifiedProfiles = StringUtils.tokenizeToStringArray(
            "dev,pro test", BeanDefinitionParserDelegate.MULTI_VALUE_ATTRIBUTE_DELIMITERS);
        System.out.println(specifiedProfiles.toString());
    }
}
