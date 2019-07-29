package com.manual.mvc.service;

import com.manual.mvc.annotation.LPService;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 16:13
 */
@LPService("loginService")
public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String account, String pwd) {
        System.out.println("账户 = " + account + ", 密码 = " + pwd);
    }
}
