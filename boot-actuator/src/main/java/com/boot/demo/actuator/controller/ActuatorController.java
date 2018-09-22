package com.boot.demo.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午8:25
 */
@RestController
@RequestMapping("/actuator")
public class ActuatorController {

    @GetMapping("/hello")
    public String hello() {
        return "hello actuator";
    }
}
