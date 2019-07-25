package com.janita.about.bean.service;

import com.boot.demo.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:34
 */
@Service
public class TestService {

    @Autowired
    private User user;

    public User get() {
       return user;
    }
}
