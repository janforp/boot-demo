package com.boot.demo.auto.dao;

import com.boot.demo.auto.entity.User;

import java.util.List;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-13
 */
public interface UserDAO {
    int deleteByPrimaryKey(String userId);

    void insert(User record);

    void insertSelective(User record);

    void insertBatch(List<User> records);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}