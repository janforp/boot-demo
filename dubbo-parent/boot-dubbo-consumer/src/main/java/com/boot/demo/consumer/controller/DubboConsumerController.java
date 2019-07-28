package com.boot.demo.consumer.controller;

import com.boot.demo.common.model.User;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.dubbo.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/11 - 下午10:38
 * 类说明：
 */
@RestController
@RequestMapping("/dubbo")
public class DubboConsumerController {

    @Autowired
    private IUserService userService;

    /**
     * http://127.0.0.1:9011/dubbo/1
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResultDTO<User> getByUserId(@PathVariable String userId) {
        User user = userService.getUserById(userId);
        return ResultDTO.toSuccess(user);
    }
}
