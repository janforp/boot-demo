package com.manual.mvc.controller;

import com.manual.mvc.annotation.LPAutowired;
import com.manual.mvc.annotation.LPController;
import com.manual.mvc.annotation.LPRequestMapping;
import com.manual.mvc.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 16:09
 */
@LPController
@LPRequestMapping("/test")
public class TestController {

    @LPAutowired
    private LoginService loginService;

    @LPRequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, String account, String pwd) throws IOException {
        loginService.login(account, pwd);
        response.getWriter().write("request success, param:" + account + "-" + pwd);
    }
}
