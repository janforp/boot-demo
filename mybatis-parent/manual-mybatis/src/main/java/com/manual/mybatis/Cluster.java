package com.manual.mybatis;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 19:18
 */
public class Cluster {

    public static void main(String[] args) {
        UserMapper userMapper = SqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser("name", "123");
        System.out.println(user.getUserName());
    }
}
