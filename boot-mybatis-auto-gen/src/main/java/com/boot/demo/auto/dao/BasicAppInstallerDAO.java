package com.boot.demo.auto.dao;

import com.boot.demo.auto.entity.BasicAppInstaller;

import java.util.List;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-13
 */
public interface BasicAppInstallerDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(BasicAppInstaller record);

    void insertSelective(BasicAppInstaller record);

    void insertBatch(List<BasicAppInstaller> records);

    BasicAppInstaller selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BasicAppInstaller record);

    int updateByPrimaryKey(BasicAppInstaller record);
}