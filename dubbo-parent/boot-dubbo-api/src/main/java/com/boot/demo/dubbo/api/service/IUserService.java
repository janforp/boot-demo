package com.boot.demo.dubbo.api.service;

import com.boot.demo.common.model.User;

/**
 * @author janita
 * @since 2018/9/11 - 下午10:20
 * 类说明：
 */
public interface IUserService {

    User getUserById(String userId);
}
