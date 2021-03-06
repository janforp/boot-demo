package com.boot.demo.mybatis2.controller;

import com.boot.demo.common.model.QueryDto;
import com.boot.demo.common.model.User;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.mybatis2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * localhost:9118/user/1
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResultDTO<User> findById(@PathVariable("userId") String userId) {
        User user = userService.findById(userId);
        return ResultDTO.toSuccess(user);
    }

    @GetMapping("/testChoose")
    public ResultDTO<List<User>> testChoose(QueryDto dto) {
        dto.setSortField(StringUtils.isEmpty(dto.getSortField()) ? null : dto.getSortField());
        dto.setSortType(StringUtils.isEmpty(dto.getSortType()) ? null : dto.getSortType());
        List<User> userList = userService.testChoose(dto);
        return ResultDTO.toSuccess(userList);
    }

    @GetMapping("/choose")
    public ResultDTO<List<User>> choose(QueryDto dto) {
        dto.setSortField(StringUtils.isEmpty(dto.getSortField()) ? null : dto.getSortField());
        dto.setSortType(StringUtils.isEmpty(dto.getSortType()) ? null : dto.getSortType());
        List<User> userList = userService.choose(dto);
        return ResultDTO.toSuccess(userList);
    }
}
