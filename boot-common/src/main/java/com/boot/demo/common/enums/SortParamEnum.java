package com.boot.demo.common.enums;

import lombok.Getter;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/13 - 下午5:03
 */
public enum  SortParamEnum {

    /**
     *
     */
    NAME_ASC("1", "1", "user_name", "asc"),

    /**
     *
     */
    NAME_DESC("1", "0", "user_name", "desc"),

    /**
     *
     */
    NO_ASC("2", "1", "user_id", "asc"),

    /**
     *
     */
    NO_DESC("2", "0", "user_id", "desc");

    @Getter
    private String sortField;

    @Getter
    private String sortType;

    @Getter
    private String fieldName;

    @Getter
    private String typeName;

    SortParamEnum(String sortField, String sortType, String fieldName, String typeName) {
        this.sortField = sortField;
        this.sortType = sortType;
        this.fieldName = fieldName;
        this.typeName = typeName;
    }

    public static SortParamEnum getSortParamEnum(String sortField, String sortType) {

        for (SortParamEnum param : values()) {
            String field = param.getSortField();
            String type = param.getSortType();
            if (field.equals(sortField) && type.equals(sortType)) {
                return param;
            }
        }
        return null;
    }
}
