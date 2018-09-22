package com.boot.demo.property.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author janita
 * @since 2018/9/9 - 上午10:41
 * 类说明：
 */
@ConfigurationProperties(prefix="data")
public class DataConfig {

    private static String url;

    private static String username;

    private static String password;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        DataConfig.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DataConfig.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DataConfig.password = password;
    }
}
