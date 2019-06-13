package com.boot.demo.swagger.controller;

import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.swagger.dto.UserDTO;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author janita
 * @since 2018/9/9 - 下午11:54
 * 类说明：
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "swagger相关的接口")
public class SwaggerController {

    @PostMapping
    @ApiOperation(value = "这里是接口的一个说明")
    public ResultDTO<UserDTO> swaggerAdd(@RequestBody UserDTO user) {
        return ResultDTO.toSuccess(user);
    }

    @GetMapping("/{userId}")
    @ApiOperation(value = "根据id查询用户")
    public ResultDTO<UserDTO> findById(@PathVariable String userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setGender(1);
        userDTO.setUserName("李四");
        return ResultDTO.toSuccess(userDTO);
    }

    @GetMapping("/findByGender")
    @ApiOperation(value = "根据性别查询用户")
    public ResultDTO<List<UserDTO>> findByGender(@ApiParam("性别") @RequestParam Integer gender) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("2");
        userDTO.setGender(gender);
        userDTO.setUserName("李四");
        return ResultDTO.toSuccess(Lists.newArrayList(userDTO));
    }
}
