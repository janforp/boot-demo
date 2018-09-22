package com.boot.demo.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:48
 * 类说明：
 */
@Data
public class User implements Serializable {

    private String userId;

    private String userName;

    private Integer gender;

    private String remark;
}
