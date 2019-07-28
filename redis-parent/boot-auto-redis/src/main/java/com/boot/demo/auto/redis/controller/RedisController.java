package com.boot.demo.auto.redis.controller;

import com.boot.demo.common.result.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/10 - 下午11:44
 * 类说明：
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * http://127.0.0.1:9009/redis/key/value
     *
     * @param key
     * @param value
     * @return
     */
    @GetMapping("/{key}/{value}")
    public ResultDTO<String> setToRedis(@PathVariable String key, @PathVariable String value) {
        redisTemplate.opsForValue().set(key, value);
        return ResultDTO.toSuccess(null);
    }

    /**
     * http://127.0.0.1:9009/redis/fetch/key
     *
     * @param key
     * @return
     */
    @GetMapping("/fetch/{key}")
    public ResultDTO<String> getFromRedis(@PathVariable String key) {
        return ResultDTO.toSuccess((String) redisTemplate.opsForValue().get(key));
    }
}
