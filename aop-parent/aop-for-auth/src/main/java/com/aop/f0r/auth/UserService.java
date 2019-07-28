package com.aop.f0r.auth;

import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-28 - 09:55
 */
@Service
public class UserService {
    public String getCurrentUserAuth() {
        return "1";
    }
}
