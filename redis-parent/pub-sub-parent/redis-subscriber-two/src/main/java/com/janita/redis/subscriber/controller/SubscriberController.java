package com.janita.redis.subscriber.controller;

import com.janita.redis.common.RedisUtilsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 18:23
 */
@RestController
@RequestMapping("/subscribe")
public class SubscriberController {

    @Autowired
    private RedisUtilsTemplate template;

    @GetMapping("/subscribe")
    public String subscribe(String message) {
        return template.get(message);
    }
}
