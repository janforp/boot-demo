package com.boot.demo.swagger.controller;

import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.swagger.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/9 - 下午11:54
 * 类说明：
 */
@RestController
@RequestMapping("/swagger")
@Api(description = "swagger相关的接口")
public class SwaggerController {

    @PostMapping
    @ApiOperation(value = "这里是接口的一个说明")
    public ResultDTO<UserDTO> swaggerAdd(@RequestBody UserDTO user) {
        return ResultDTO.toSuccess(user);
    }
}
