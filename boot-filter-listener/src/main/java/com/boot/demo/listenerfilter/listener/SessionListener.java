package com.boot.demo.listenerfilter.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:36
 * 类说明：
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    /**
     * Notification that a session was created.
     *
     * @param se the notification event
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("\n***\t" + "监听到session创建事件" + "\n");
    }

    /**
     * Notification that a session is about to be invalidated.
     *
     * @param se the notification event
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("\n***\t" + "session销毁" + "\n");
    }
}
