package com.boot.demo.common.dao;


import com.boot.demo.common.model.Person;

import java.util.List;

/**
 * Created by com.janita.caffeinecache.MybatisCodeGenerate on 2017-07-11
 */
public interface PersonDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(Person record);

    void insertSelective(Person record);

    void insertBatch(List<Person> records);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}