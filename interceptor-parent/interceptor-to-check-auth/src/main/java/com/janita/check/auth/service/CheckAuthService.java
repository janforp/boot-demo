package com.janita.check.auth.service;

import com.janita.check.auth.role.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 14:35
 */
@Service
public class CheckAuthService {

    /**
     * 校验token
     *
     * @param roleOfTheUser     用户的角色
     * @param roleTheMethodNeed 能够返回该资源的角色
     */
    public void checkAuth(Role roleOfTheUser, List<Role> roleTheMethodNeed) {
        if (!roleTheMethodNeed.contains(roleOfTheUser)) {
            throw new IllegalArgumentException("没有权限");
        }
    }
}
