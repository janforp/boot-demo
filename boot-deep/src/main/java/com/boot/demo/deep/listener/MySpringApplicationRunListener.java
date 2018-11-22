package com.boot.demo.deep.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/21 - 下午8:22
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
    Logger logger = LoggerFactory.getLogger(MySpringApplicationRunListener.class);
    private final SpringApplication application;
    private final String[] args;
    public MySpringApplicationRunListener(SpringApplication application, String[] args){
        this.application = application;
        this.args = args;
    }
    @Override
    public void starting() {
        System.out.println("===============starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        environment.setActiveProfiles("Develop");
        logger.info("===============environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        logger.info("===============contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        logger.info("===============contextLoaded");
    }

    @Override
    public void finished(ConfigurableApplicationContext context,
        Throwable exception) {
        logger.info("===============finished");
    }

}
