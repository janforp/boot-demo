package com.manual.mybatis;

import java.lang.reflect.Proxy;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 19:04
 */
public class SqlSession {

    /**加载Mapper接口*/
    public static <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandlerMybatis());
    }

    public static void main(String[] args) {
        UserMapper userMapper = SqlSession.getMapper(UserMapper.class);
        int i = userMapper.insertUser("", "");
        System.out.println(i);
    }
}
