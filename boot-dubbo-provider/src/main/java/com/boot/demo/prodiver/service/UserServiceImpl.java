package com.boot.demo.prodiver.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.demo.common.model.User;
import com.boot.demo.dubbo.api.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author janita
 * @since 2018/9/11 - 下午10:22
 * 类说明：
 */
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {


    @Override
    public User getUserById(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("dubbo服务提供者提供的user");
        return user;
    }

}
