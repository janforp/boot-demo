package com.manual.mybatis.mapper;


import com.manual.mybatis.annotation.ExtInsert;
import com.manual.mybatis.annotation.ExtMapper;
import com.manual.mybatis.annotation.ExtParam;
import com.manual.mybatis.annotation.ExtSelect;
import com.manual.mybatis.entity.User;

/**
 * 接口既然不能被实例化？那么我们是怎么实现能够调用的？
 * 动态代理
 */
@ExtMapper
public interface UserMapper {

    @ExtSelect("select * from test_user where name=#{name} and age=#{age}")
    User selectUser(@ExtParam("name") String name, @ExtParam("age") Integer age);

    @ExtInsert("insert into test_user(name,age) values(#{name},#{age})")
    int insertUser(@ExtParam("name") String name, @ExtParam("age") Integer age);

    /**
     * 如果查询是List<User>
     */

}
