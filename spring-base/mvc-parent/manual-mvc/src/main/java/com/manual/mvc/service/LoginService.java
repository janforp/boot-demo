package com.manual.mvc.service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 16:12
 */
public interface LoginService {

    /**
     * 登录
     *
     * @param account 账户
     * @param pwd     密码
     */
    void login(String account, String pwd);
}
