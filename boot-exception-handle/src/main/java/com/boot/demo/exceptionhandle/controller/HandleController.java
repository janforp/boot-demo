package com.boot.demo.exceptionhandle.controller;

import com.boot.demo.common.result.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/10 - 上午12:07
 * 类说明：
 */
@RestController
@RequestMapping("/handle")
public class HandleController {

    @GetMapping
    public ResultDTO handle() {
        throw new RuntimeException("有情况");
    }
}
