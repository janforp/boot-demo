package com.boot.demo.transaction.controller;

import com.boot.demo.common.model.User;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:51
 * 类说明：
 */
@RestController
@RequestMapping("/user")
public class TransactionController {

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

    @GetMapping("/transaction")
//    @Transactional(rollbackFor = Exception.class)
    public ResultDTO<User> transaction() {
        User user = new User();
        user.setUserId(new Random(100).nextInt() + "");
        user.setUserName("Janita");
        user.setGender(1);
        user.setRemark("remark");
        userService.insert(user);
        return ResultDTO.toSuccess(user);
    }
}
