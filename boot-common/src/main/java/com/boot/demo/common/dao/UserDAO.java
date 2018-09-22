package com.boot.demo.common.dao;

import com.boot.demo.common.model.User;

/**
 * @author janita
 * @since 2018/9/9 - 上午11:16
 * 接口说明：
 */
public interface UserDAO {

    int deleteByPrimaryKey(String userId);

    void insert(User user);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKey(User user);
}
