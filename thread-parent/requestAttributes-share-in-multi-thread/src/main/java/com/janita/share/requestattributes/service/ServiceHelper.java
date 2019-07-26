package com.janita.share.requestattributes.service;

import com.janita.share.requestattributes.RequestAttributesContext;
import com.janita.share.requestattributes.config.AppConfig;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import static com.janita.share.requestattributes.RequestAttributesContext.PASS_WORD;

@Component
public class ServiceHelper {

    @Async(AppConfig.ASYNC_EXECUTOR_NAME)
    public void sendEmail(String userId) throws InterruptedException {
        Thread.sleep(2000);
        String password = RequestAttributesContext.getByKey(PASS_WORD);
        System.out.println("发送邮件给 " + userId+ "，密码是 " + password);
    }
}
