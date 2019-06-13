package com.boot.demo.swagger.controller;

import com.boot.demo.common.model.UserDto;
import com.boot.demo.common.result.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类说明：jconsole
 *
 * <p>
 *     ab -c 10 -n 10000 http://localhost:9111/console/fuuk
 * </p>
 *
 * @author zhucj
 * @since 2019-06-13 - 19:30
 */
@RestController
@RequestMapping("/console")
public class JConsoleController {

    // private static AtomicInteger atomicInteger = new AtomicInteger(0);
    // private static int a = 0;
    int b = 0;

    @GetMapping("/fuuk")
    public ResultDTO<UserDto> fuuk() {
        // System.out.println("atomicInteger = " + atomicInteger.incrementAndGet());
        // System.out.println("a = " + ++a);
        System.out.println("b = " + ++b);
        return ResultDTO.toSuccess(new UserDto());
    }
}
