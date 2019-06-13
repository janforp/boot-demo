package com.boot.demo.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author janita
 * @since 2018/9/11 - 下午11:12
 * 类说明：
 */
@ApiModel(description = "添加用户的参数")
@Data
@ToString
public class UserDTO {

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "备注")
    private String remark;
}
