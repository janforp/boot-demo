package com.boot.demo.property.controller;

import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.property.config.CustomProperties;
import com.boot.demo.property.config.DataConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author janita
 * @since 2018/9/10 - 下午10:50
 * 类说明：
 */
@RestController
@RequestMapping("/value")
public class PropertyController {

    @Value("${value.one}")
    private String valueOne;

    @GetMapping
    public ResultDTO<String> readValue() {
        return ResultDTO.toSuccess(valueOne);
    }

    @GetMapping("/static")
    public ResultDTO<String> readStatic() {
        return ResultDTO.toSuccess(CustomProperties.STATIC_ONE);
    }

    @GetMapping("/data")
    public ResultDTO<Map<String, String>> data() {
        Map<String, String> map = new HashMap<String, String>(3);
        map.put("url", DataConfig.getUrl());
        map.put("username", DataConfig.getUsername());
        map.put("password", DataConfig.getPassword());
        return ResultDTO.toSuccess(map);
    }
}
