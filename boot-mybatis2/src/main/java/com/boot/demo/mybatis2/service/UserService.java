package com.boot.demo.mybatis2.service;

import com.boot.demo.common.dao.UserDAO;
import com.boot.demo.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author janita
 * @since 2018/9/9 - 上午11:00
 * 类说明：
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User findById(String userId) {

        User user = new User();
        user.setGender(1);
        user.setRemark("这是一个好人");
        user.setUserId(userId);
        user.setUserName("张三");
        return user;
    }

    public User addUser(User user) {
        user.setUserId("1");
        userDAO.insert(user);
        return user;
    }
}
