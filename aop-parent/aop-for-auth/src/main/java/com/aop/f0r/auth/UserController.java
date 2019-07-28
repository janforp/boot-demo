package com.aop.f0r.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-28 - 09:57
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    @Permission(authorities = "1")
    public String test() {
        return "success";
    }
}
