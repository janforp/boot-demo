package com.boot.demo.auto.entity;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-18
 */
public class BasicAppMenuReceiver implements java.io.Serializable {

    // Fields

    private Integer id;
    // 菜单id
    private Integer menuId;
    // 标签类型
    private String tagType;
    // 标签值
    private String tagValue;

    // Constructors

    /**
     * default constructor
     */
    public BasicAppMenuReceiver() {
    }

    /**
     * full constructor
     */
    public BasicAppMenuReceiver(Integer menuId, String tagType, String tagValue) {
        this.menuId = menuId;
        this.tagType = tagType;
        this.tagValue = tagValue;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 菜单id
     */
    public Integer getMenuId() {
        return this.menuId;
    }

    /**
     * 菜单id
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 标签类型
     */
    public String getTagType() {
        return this.tagType;
    }

    /**
     * 标签类型
     */
    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    /**
     * 标签值
     */
    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * 标签值
     */
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

}