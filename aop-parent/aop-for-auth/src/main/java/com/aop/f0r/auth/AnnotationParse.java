package com.aop.f0r.auth;

import java.lang.reflect.Method;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-28 - 09:54
 */
public class AnnotationParse {

    /**
     * 解析权限注解
     * @param method
     * @return 返回注解的权限值
     */
    public static String privilegeParse(Method method) {
        //获取该方法
        if (method.isAnnotationPresent(Permission.class)) {
            Permission annotation = method.getAnnotation(Permission.class);
            return annotation.authorities();
        }
        return null;
    }
}
