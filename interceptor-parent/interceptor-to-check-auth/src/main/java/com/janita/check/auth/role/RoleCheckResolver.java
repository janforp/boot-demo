package com.janita.check.auth.role;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 15:07
 */
public interface RoleCheckResolver {

    /**
     * 一种基于开发环境的灵活考虑。一般情况下开发环境直接通过postman测试的时候，可以不需要进行一些花里胡哨的验证，所以提供一个接口给开发人员，便于绕过这一些基于
     *
     * @return 是否需要校验
     */
    boolean needCheck();
}
