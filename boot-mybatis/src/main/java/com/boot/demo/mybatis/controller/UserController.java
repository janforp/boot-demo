package com.boot.demo.mybatis.controller;

import com.boot.demo.common.model.User;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:51
 * 类说明：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResultDTO<User> addUser(@RequestBody User user) {
        user = userService.addUser(user);
        return ResultDTO.toSuccess(user);
    }

    @GetMapping("/{userId}")
    public ResultDTO<User> findById(@PathVariable("userId") String userId) {
        User user = userService.findById(userId);
        return ResultDTO.toSuccess(user);
    }
}
