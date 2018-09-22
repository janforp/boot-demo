package com.boot.demo.exceptionhandle.exception;

import com.boot.demo.common.result.ResultDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Janita on 2017-05-22 11:51
 * 自定义异常统
 * 一处理
 */
@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = RuntimeException.class)
    public ResultDTO handleNullPointerException(RuntimeException e) {
        return ResultDTO.toError(-1, e.getMessage());
    }
}
