package com.boot.demo.aop.controller;

import com.boot.demo.common.model.User;
import com.boot.demo.common.result.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/10 - 下午11:22
 * 类说明：
 */
@RestController
@RequestMapping("/log")
public class AopLogController {

    @GetMapping("/{id}")
    public ResultDTO<User> findById(@PathVariable String id) {
        User user = new User();
        user.setUserId(id);
        user.setUserName("Lucy");
        return ResultDTO.toSuccess(user);
    }
}
