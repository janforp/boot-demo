package com.boot.demo.task.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author janita
 * @since 2018/9/10 - 下午11:30
 * 类说明：
 */
@Component
@EnableScheduling
public class ScheduleTask {

    /**
     * 这个定时任务是:
     * 每年的 12 月 31 日 23 点 1 分 执行一次
     */
    //@Scheduled(cron = "0 1 23 31 12 ?")
    @Scheduled(fixedRate = 1000)
    public void task() {
        System.out.println("\n***\t" + "Hello world" + "\n");
    }
}
