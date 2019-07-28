package com.boot.demo.mybatis.service;

import com.boot.demo.common.dao.UserDAO;
import com.boot.demo.common.model.QueryDto;
import com.boot.demo.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return userDAO.selectByPrimaryKey(userId);
    }

    public User addUser(User user) {
        user.setUserId("1");
        userDAO.insert(user);
        return user;
    }

    public List<User> testChoose(QueryDto dto) {
        return userDAO.testChoose(dto);
    }
}
