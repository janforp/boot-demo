package com.boot.demo.deep.event;

import org.springframework.context.ApplicationListener;

/**
 * 类说明：
 * 厨师用于对饥饿事件的监听
 *
 * @author janita
 * @since 2018/11/5 - 下午9:18
 */
public class Chef implements ApplicationListener<HungryEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(HungryEvent event) {
        if (event.getSource() instanceof Person) {

            Person person = (Person) event.getSource();
            System.out.println(person.getName() + "饿了，开始做饭");
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("做饭完毕...开始吃吧");
    }
}
