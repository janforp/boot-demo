package com.janita.check.auth.controller;

import com.boot.demo.common.model.User;
import com.janita.check.auth.annotation.CheckAuth;
import com.janita.check.auth.role.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 14:25
 */
@RestController
@RequestMapping("/auth")
public class NeedCheckAuthController {

    @CheckAuth(role = {Role.ADMIN, Role.NORMAL_USER})
    @GetMapping(path = "/get")
    public User get() {
        return User.builder().userName("adfsd").build();
    }
}
