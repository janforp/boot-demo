package com.janita.design.c2观察者.真实案例;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-17 - 16:52
 */
@Service
public class InstersetInLogin implements OnUserLoginListener, InitializingBean {

    @Override
    public void useLogin() {
        System.out.println("有人登录");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ListenerManager.getInstance().addListener(this);
    }
}
