package com.janita.redis.subscriber.config;

import com.janita.redis.common.CommonRedisConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.Resource;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 18:29
 */
@Configuration
@Import(value = {CommonRedisConfig.class})
public class RedisConfig {

    @Bean
    public StringRedisSerializer stringRedisSerializer() {
        return new StringRedisSerializer();
    }

    public RedisSerializer redisSerializer() {
        return new JdkSerializationRedisSerializer();
    }
}
