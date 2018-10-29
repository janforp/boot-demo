package com.boot.demo.common.model;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:48
 * 类说明：
 */
@Data
public class User implements Serializable {

    private String userId;

    private String userName;

    private Integer gender;

    private String remark;

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User();
        user.setUserId("id123");
        user.setUserName("姓名");
        user.setGender(1);
        user.setRemark("备注");
        Map<String, String> describe = BeanUtils.describe(user);
        System.out.println(describe);
    }
}
