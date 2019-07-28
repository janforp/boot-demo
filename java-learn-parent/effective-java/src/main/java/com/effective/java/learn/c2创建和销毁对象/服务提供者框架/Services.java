package com.effective.java.learn.c2创建和销毁对象.服务提供者框架;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-15 - 22:47
 */
public class Services {

    private Services() {
    }

    private static final Map<String, Provider> PROVIDERS = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    /**
     * Provider registration API 提供者注册API
     */
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        PROVIDERS.put(name, p);
    }

    /**
     * Service access API 服务访问API
     */
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String name) {
        Provider p = PROVIDERS.get(name);
        if (p == null) {
            throw new IllegalArgumentException("没有该名称的提供者");
        }
        return p.newService();
    }
}
