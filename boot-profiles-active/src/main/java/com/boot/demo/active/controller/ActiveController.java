package com.boot.demo.active.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午8:02
 */
@RestController
@RequestMapping("/active")
public class ActiveController {

    @Value("${token.value}")
    private String tokenValue;

    @GetMapping
    public String test() {
        System.out.println("\n***\t" + tokenValue + "\n");
        return tokenValue;
    }
}
