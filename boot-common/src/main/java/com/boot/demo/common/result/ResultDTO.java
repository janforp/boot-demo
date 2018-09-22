package com.boot.demo.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author janita
 * @since 2018/9/9 - 上午11:00
 * 类说明：
 */
@Data
@ApiModel(value = "返回模型")
public class ResultDTO<T> {

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回msg")
    private String msg;

    @ApiModelProperty(value = "返回的数据")
    private T data;

    public static <T> ResultDTO<T> toSuccess(T data) {
        ResultDTO<T> resultDTO = new ResultDTO<T>();
        resultDTO.setCode(0);
        resultDTO.setMsg("success");
        resultDTO.setData(data);
        return resultDTO;
    }

    public static ResultDTO toError(Integer code, String msg) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMsg(msg);
        return resultDTO;
    }
}
