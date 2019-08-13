package com.boot.demo.hello.controller;

import com.boot.demo.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {

        return "hello word";
    }

    @GetMapping("throwA")
    public String throwEx() {
        helloService.throwExcep();
        return "a";
    }

    @GetMapping("throwB")
    public String throwB() {
       try {
           helloService.throwExcep();
           return "a";
       }catch (Exception e) {
           System.out.println(e);
       }
       return "";
    }
}
