package com.boot.demo.mybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:41
 * 类说明：
 */
@SpringBootApplication
@MapperScan(basePackages = "com.boot.demo.common.dao")
public class BootMybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootMybatis2Application.class, args);
    }
}
