package com.janita.register.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:33
 */
@SpringBootApplication
@ServletComponentScan
public class RegisterInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterInterceptorApplication.class, args);
    }

}
