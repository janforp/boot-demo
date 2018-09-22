package com.boot.demo.redis.controller;

import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.redis.config.RedisUtils;
import com.boot.demo.redis.config.RedisUtilsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
    private RedisUtilsTemplate template;

    @GetMapping("/{key}/{value}")
    public ResultDTO<String> setToRedis(@PathVariable String key, @PathVariable String value) {
        RedisUtils.setKeyOfString(template, key, value);
        return ResultDTO.toSuccess(null);
    }

    @GetMapping("/fetch/{key}")
    public ResultDTO<String> getFromRedis(@PathVariable String key) {
        String value = RedisUtils.getStringOfKey(template, key);
        template.convertAndSend("channel", "12");
        return ResultDTO.toSuccess(value);
    }
}
