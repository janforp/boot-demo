package com.janita.redis.subscriber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.Topic;

import javax.annotation.Resource;

import static com.janita.redis.common.RedisChannelConstant.CHANNEL_1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 19:22
 */
@Configuration
public class RedisSubConfig {

    /** redis 连接工厂 */
    @Resource
    private RedisConnectionFactory redisConnectionFactory;

    /**
     *     Redis消息监听器
     */
    @Resource
    private MessageListener redisMsgListener;

    /**
     * 定义redis的监听器
     * @return 监听容器
     */
    @Bean
    public RedisMessageListenerContainer initRedisContainer() {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        //Redis连接工厂
        container.setConnectionFactory(redisConnectionFactory);
        //设置运行任务的线程池
        //定义监听渠道，名称为topic1
        Topic topic = new ChannelTopic(CHANNEL_1);
        //使用监听器监听Redis的消息
        container.addMessageListener(redisMsgListener, topic);
        return container;
    }
}
