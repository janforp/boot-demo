package com.boot.demo.listenerfilter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:36
 * 类说明：
 */
@WebListener
public class MyServletContextListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("\n****************** " + "监听器启动...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("\n****************** " + "监听器销毁...");
    }
}
