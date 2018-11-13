package com.boot.demo.mybatis2.service;

import com.boot.demo.common.dao.UserDAO;
import com.boot.demo.common.enums.SortParamEnum;
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

    public List<User> testChoose(QueryDto dto) {
        return userDAO.testChoose(dto);
    }

    public List<User> choose(QueryDto dto) {
        SortParamEnum sortParamEnum = SortParamEnum.getSortParamEnum(dto.getSortField(), dto.getSortType());
        if (sortParamEnum != null) {
            String fieldName = sortParamEnum.getFieldName();
            String typeName = sortParamEnum.getTypeName();
            dto.setSortField(fieldName);
            dto.setSortType(typeName);
        } else {
            dto.setSortField(null);
            dto.setSortType(null);
        }
        return userDAO.choose(dto);
    }
}
