package com.boot.demo.hello.service;

import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-08-12 - 16:50
 */
@Service
public class HelloService {

    public void throwExcep() {
        System.out.println("f");
        int a = 100 / 0 ;
        System.out.println("a");
    }

}
