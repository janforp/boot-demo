package com.boot.demo.auto.dao;

import com.boot.demo.auto.entity.BasicAppMenuReceiver;

import java.util.List;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-18
 */
public interface BasicAppMenuReceiverDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(BasicAppMenuReceiver record);

    void insertSelective(BasicAppMenuReceiver record);

    void insertBatch(List<BasicAppMenuReceiver> records);

    BasicAppMenuReceiver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BasicAppMenuReceiver record);

    int updateByPrimaryKey(BasicAppMenuReceiver record);
}