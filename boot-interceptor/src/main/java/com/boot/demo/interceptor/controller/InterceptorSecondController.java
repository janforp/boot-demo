package com.boot.demo.interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-21 19:41
 * @author Janita
 */
@RestController
@RequestMapping(value = "/interceptor/second")
public class InterceptorSecondController {

    @RequestMapping("/hello")
    public String interceptor(){
        return "Hello world";
    }
}
