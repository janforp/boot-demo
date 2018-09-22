package com.boot.demo.property.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:41
 * 类说明：
 */
@ConfigurationProperties
public class CustomProperties implements InitializingBean {

    public static String STATIC_ONE;

    @Value("${static.one}")
    private String staticOne;

    @Override
    public void afterPropertiesSet() throws Exception {
        STATIC_ONE = staticOne;
    }
}
