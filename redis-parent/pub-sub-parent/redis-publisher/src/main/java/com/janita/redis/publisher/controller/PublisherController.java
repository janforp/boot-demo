package com.janita.redis.publisher.controller;

import com.janita.redis.common.RedisUtilsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 18:21
 */
@RestController
@RequestMapping("/publish")
public class PublisherController {

    @Autowired
    private RedisUtilsTemplate template;

    @GetMapping("/publish")
    public String publish(String message) {
        template.set("1", "2");
        return message;
    }
}
