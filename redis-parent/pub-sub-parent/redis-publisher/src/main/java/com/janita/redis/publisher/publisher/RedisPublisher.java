package com.janita.redis.publisher.publisher;

import com.janita.redis.common.RedisUtilsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.janita.redis.common.RedisChannelConstant.CHANNEL_1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 19:13
 */
@EnableScheduling
@Component
public class RedisPublisher {

    @Autowired
    RedisUtilsTemplate redisUtilsTemplate;

    private int index = 0;

    //向redis消息队列index通道发布消息
    @Scheduled(fixedRate = 3000)
    public void sendMessage(){
        String message = "第" + index + "条消息";
        System.out.println("【发布】" + message);
        redisUtilsTemplate.convertAndSend(CHANNEL_1,message);
        index ++;
    }
}
