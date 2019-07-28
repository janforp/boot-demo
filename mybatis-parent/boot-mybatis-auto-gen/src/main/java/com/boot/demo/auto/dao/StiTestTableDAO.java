package com.boot.demo.auto.dao;

import com.boot.demo.auto.entity.StiTestTable;

import java.util.List;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2019-01-18
 */
public interface StiTestTableDAO {
    int deleteByPrimaryKey(Long id);

    void insert(StiTestTable record);

    void insertSelective(StiTestTable record);

    void insertBatch(List<StiTestTable> records);

    StiTestTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StiTestTable record);

    int updateByPrimaryKey(StiTestTable record);
}