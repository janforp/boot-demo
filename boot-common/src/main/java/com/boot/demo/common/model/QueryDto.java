package com.boot.demo.common.model;

import lombok.Data;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/13 - 下午3:11
 */
@Data
public class QueryDto {

    /**
     * 排序的字段
     * 现在支持按：名字，工号，入职时间进行升序，降序排列
     *
     * 1:名字
     * 2：工号
     */
    private String sortField;

    /**
     * 排序的方式
     * 1：升序
     * 0：降序
     */
    private String sortType;

    /**
     * 1:按 remark排序
     */
    private String flag;
}
