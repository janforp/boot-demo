package com.boot.demo.deep.word;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 类说明：
 * 深入理解SpringBoot的启动
 * https://www.cnblogs.com/niechen/p/8947973.html?utm_source=gold_browser_extension
 *
 * @author janita
 * @since 2018/11/1 - 下午8:50
 */
public class ThreeStartBoot {

    /**
     * java的事件机制：
     *
     * @see java.util.EventObject
     * @see java.util.EventListener
     * @see org.springframework.context.ApplicationEventPublisher
     * 这个接口比较重要,它使用来触发一个事件的(虽然方法的名称为发布事件)，调用方法publishEvent过后，事件对应的listener将会执行相应的内容
     * @see org.springframework.context.event.SimpleApplicationEventMulticaster#doInvokeListener(ApplicationListener, ApplicationEvent)
     * 该方法用于执行事件的监听方法
     */

    /**
     * 基于Spring的自定义事件
     * 启动的时候调用的初始化方法
     * @see org.springframework.boot.SpringApplication#SpringApplication(Object...)
     * 实例化sprngBoot事件的一些bean
     * @see org.springframework.boot.SpringApplication#getSpringFactoriesInstances(Class, Class[], Object...)
     *
     * 具体加载这些类的函数
     * ApplicationListener 接口,ApplicationContextInitializer 接口，这些接口都是通过SpringFactoriesLoader从META-INF/spring.factories文件里加载的
     * @see org.springframework.core.io.support.SpringFactoriesLoader#loadFactoryNames(Class, ClassLoader)
     *
     * 启动方法
     * @see org.springframework.boot.SpringApplication#run(String...)
     * 获取SpringApplicationRunListener
     * @see org.springframework.boot.SpringApplication#getRunListeners(String[])
     *
     */
}
