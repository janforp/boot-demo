package com.janita.register.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:34
 */
@RestController
@RequestMapping("/register")
public class TestController {

    @GetMapping(path = "/test")
    public String test() {
        return "test";
    }
}
