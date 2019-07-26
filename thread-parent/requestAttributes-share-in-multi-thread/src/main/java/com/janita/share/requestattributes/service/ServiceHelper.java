package com.janita.share.requestattributes.service;

import com.janita.share.requestattributes.AuthContext;
import com.janita.share.requestattributes.config.AppConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ServiceHelper {

    @Async(AppConfig.ASYNC_EXECUTOR_NAME)
    public void sendEmail(String userId) throws InterruptedException {
        Thread.sleep(2000);
        String password = AuthContext.getByKey("password");
        System.out.println("发送邮件给 " + userId+ "，密码是 " + password);
    }
}
