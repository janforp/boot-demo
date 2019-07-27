package com.sub.pub.demo.config;

import com.janita.redis.common.CommonRedisConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 18:29
 */
@Configuration
@Import(value = {CommonRedisConfig.class})
public class RedisConfig {
}
