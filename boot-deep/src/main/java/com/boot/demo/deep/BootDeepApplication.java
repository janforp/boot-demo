package com.boot.demo.deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

/**
 * 类说明：
 * 登陆druid监控页面：http://localhost:9116/druid/login.html
 *
 * @author janita
 * @date 2018/9/16 - 下午9:20
 */
@SpringBootApplication(exclude = JdbcTemplateAutoConfiguration.class)
public class BootDeepApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootDeepApplication.class, args);
    }
}