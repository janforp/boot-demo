package com.boot.demo.mybatis;

import com.boot.demo.common.swagger.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:41
 * 类说明：
 */
@SpringBootApplication
@EnableSwagger2
@Configuration
public class BootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMybatisApplication.class, args);
    }

    @Bean
    public SwaggerConfig swaggerConfig() {
        SwaggerConfig config = new SwaggerConfig();
        config.setPackageUrl("com.boot.demo.mybatis.controller");
        config.setDesc("接口文档描述");
        config.setTitle("接口文档标题");
        return config;
    }
}
