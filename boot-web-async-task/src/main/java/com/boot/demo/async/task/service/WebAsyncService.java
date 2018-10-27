package com.boot.demo.async.task.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/10/27 - 下午5:46
 */
@Service
public class WebAsyncService {

    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
