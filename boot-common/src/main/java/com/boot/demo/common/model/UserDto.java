package com.boot.demo.common.model;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:48
 * 类说明：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

    private String userId;

    private String UserName;

    private Integer Gender;

    private String remark;

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UserDto user = new UserDto();
        user.setUserId("id123");
        user.setUserName("姓名");
        user.setGender(1);
        user.setRemark("备注");
        Map<String, String> describe = BeanUtils.describe(user);
        System.out.println(describe);
    }

    public static List<UserDto> list() {
        return Lists.newArrayList(
                new UserDto("1","name1",1,"r1"),
                new UserDto("2","name2",2,"r2"),
                new UserDto("3","name3",3,"r3"),
                new UserDto("4","name4",4,"r4"));
    }
}
