package com.boot.demo.deep.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

/**
 * 类说明：
 * 模拟场景：感觉饿的时候，通知厨师做法
 * 定义一个饿状态的事件
 *
 * @author janita
 * @since 2018/11/5 - 下午9:09
 */
public class HungryEvent extends ApplicationEvent {

    @Autowired(required = false)
    public HungryEvent(Object source) {
        super(source);
    }
}
