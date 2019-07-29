package com.manual.mybatis.utils;

import com.manual.mybatis.aop.MyInvocationHandlerMybatis;

import java.lang.reflect.Proxy;

/**
 * 获取SqlSession对象
 */
public class SqlSession {

    /**
     * 获取getMapper
     */
    public static <T> T getMapper(Class<T> clas)
            throws IllegalArgumentException, InstantiationException, IllegalAccessException {
        return (T) Proxy.newProxyInstance(clas.getClassLoader(), new Class[] { clas },
                new MyInvocationHandlerMybatis(clas));
    }
}
