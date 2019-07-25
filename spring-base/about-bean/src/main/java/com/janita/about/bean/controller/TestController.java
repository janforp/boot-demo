package com.janita.about.bean.controller;

import com.boot.demo.common.model.User;
import com.janita.about.bean.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:34
 */
@RestController
@RequestMapping("/bean")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(path = "/test")
    public User test() {
        return testService.get();
    }
}
