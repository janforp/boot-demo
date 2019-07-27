package com.janita.redis.subscriber.subscribe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 18:45
 */
@Service
public class SubscriberListener implements MessageListener {

    @Autowired
    private StringRedisSerializer stringRedisSerializer;

    @Autowired
    private RedisSerializer redisSerializer;

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String channel = stringRedisSerializer.deserialize(message.getChannel());
        Object obj = redisSerializer.deserialize(message.getBody());
        System.out.println("channel = " + channel + ", 消息 = " + obj.toString());
    }
}
