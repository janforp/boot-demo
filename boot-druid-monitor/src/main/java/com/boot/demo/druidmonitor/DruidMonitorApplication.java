package com.boot.demo.druidmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 类说明：
 * 登陆druid监控页面：http://localhost:9116/druid/login.html
 *
 * @author janita
 * @date 2018/9/16 - 下午9:20
 */
@SpringBootApplication
@ServletComponentScan
public class DruidMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DruidMonitorApplication.class, args);
    }
}
