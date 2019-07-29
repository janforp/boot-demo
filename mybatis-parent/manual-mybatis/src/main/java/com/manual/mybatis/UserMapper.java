package com.manual.mybatis;

import com.manual.mybatis.annotation.ExtInsert;
import com.manual.mybatis.annotation.ExtParam;
import com.manual.mybatis.annotation.ExtSelect;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-29 - 19:05
 */
public interface UserMapper {

    @ExtInsert("insert into user(username,password) values (#{userName},#{password})")
    int insertUser(@ExtParam("userName") String userName, @ExtParam("password") String password);

    @ExtSelect("select * from user where username=#{userName} and password=#{password}")
    User selectUser(@ExtParam("userName") String userName, @ExtParam("password") String password);
}
