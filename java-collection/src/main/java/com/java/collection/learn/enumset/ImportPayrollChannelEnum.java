package com.java.collection.learn.enumset;

import com.google.common.collect.Lists;
import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangshuo
 * @since 1.0.0, 2018/03/22
 */
public enum ImportPayrollChannelEnum {

    /**
     * //废弃
     */
    NORMAL("1", "正常导入"),
    PAYROLL_TOOL("2", "工资条发放"),

    /**
     * 一键生成申报表,即将废弃
     */
    TAX_TOOL("3", "个税工具化"),

    /**
     * 18版智能算税,即将废弃
     */
    TAX_CALCULATE("4", "智能算税"),

    TAX_CALCULATE_19("5", "19版智能算税"),
    SUBSTITUDE("6", "代报工资导入"),
    SUPPLY_PAYROLL("7", "补全工资表");

    @Getter
    private String code;

    @Getter
    private String name;

    ImportPayrollChannelEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static List<String> getChannelCodeList(List<ImportPayrollChannelEnum> enumList) {
        if (CollectionUtils.isEmpty(enumList)) {
            return Lists.newArrayListWithCapacity(0);
        }
        return enumList.stream().map(ImportPayrollChannelEnum::getCode).collect(Collectors.toList());
    }

    /**
     * 允许查询的工资表导入渠道列表
     */
    public static final List<String> ALLOW_QUERY_PAYROLL_CHANNEL_LIST =
        Lists.newArrayList(ImportPayrollChannelEnum.NORMAL.getCode(), ImportPayrollChannelEnum.PAYROLL_TOOL.getCode(),
                           ImportPayrollChannelEnum.TAX_CALCULATE.getCode(), ImportPayrollChannelEnum.TAX_CALCULATE_19.getCode());

    /**
     * 允许查询的工资表导入渠道列表
     */
    public static final List<String> ALLOW_QUERY_PAYROLL_CHANNEL_LIST_2 =
        Lists.newArrayList(ImportPayrollChannelEnum.NORMAL.getCode(), ImportPayrollChannelEnum.PAYROLL_TOOL.getCode(),
                           ImportPayrollChannelEnum.TAX_CALCULATE.getCode(), ImportPayrollChannelEnum.TAX_CALCULATE_19.getCode(),
                           ImportPayrollChannelEnum.SUBSTITUDE.getCode());

}
