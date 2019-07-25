package com.janita.check.auth.annotation;

import com.janita.check.auth.role.Role;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 14:25
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CheckAuth {

    /**
     * 默认使用接口的角色是管理员
     */
    Role[] role() default Role.ADMIN;
}
