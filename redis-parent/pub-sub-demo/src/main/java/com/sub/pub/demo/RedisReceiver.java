package com.sub.pub.demo;

import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-27 - 19:03
 */
@Service
public class RedisReceiver {

    public void receiveMessage(String message) {
        System.out.println("消息来了："+message);
        //这里是收到通道的消息之后执行的方法
    }
}