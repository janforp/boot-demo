package com.boot.demo.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/8 - 下午8:33
 * 类说明：
 */
@RestController
@RequestMapping("/demo")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {

        return "hello word";
    }
}
