package com.janita.design.c2观察者.真实案例;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-17 - 16:47
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        List<OnUserLoginListener> allListeners = ListenerManager.getInstance().getAllListeners();
        for (final OnUserLoginListener allListener : allListeners) {
            allListener.useLogin();
        }
        return "success";
    }
}
