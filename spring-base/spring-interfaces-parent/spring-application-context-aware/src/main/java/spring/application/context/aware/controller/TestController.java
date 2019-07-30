package spring.application.context.aware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.application.context.aware.service.TestService;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-30 - 13:54
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(String test) {
        return testService.test(test);
    }
}
