package com.boot.demo.property;

import com.boot.demo.property.config.CustomProperties;
import com.boot.demo.property.config.DataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:41
 * 类说明：
 */
@SpringBootApplication
@EnableConfigurationProperties({CustomProperties.class, DataConfig.class})
public class BootPropertyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootPropertyApplication.class, args);
    }
}
