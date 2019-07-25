package com.janita.about.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 12:03
 */
@ServletComponentScan
@SpringBootApplication
public class AboutBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(AboutBeanApplication.class, args);
    }
}
