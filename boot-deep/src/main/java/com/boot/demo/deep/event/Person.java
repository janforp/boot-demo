package com.boot.demo.deep.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * 类说明：
 * 如果 hungry = 0 则通知厨师做饭
 *
 * @author janita
 * @since 2018/11/5 - 下午9:12
 */
public class Person implements ApplicationEventPublisherAware {

    private int hungry;

    private String name;

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void isNeedEat() {
        if (this.hungry == 0) {
            System.out.println("太饿了，需要吃东西");
            new Thread(() -> this.applicationEventPublisher.publishEvent(new HungryEvent(this))).start();
            System.out.println("通知完毕");
        }
    }
}
