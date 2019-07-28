package com.boot.demo.auto.entity;

import java.util.*;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2019-01-18
 */
public class StiTestTable implements java.io.Serializable {

    // Fields

    // 序号
    private Long id;
    // 企业id
    private Long companyId;
    // 字段1
    private String field1;
    // 字段2
    private String field2;
    // 字段3
    private String field3;
    // 创建时间
    private Date createDate;
    // 更新时间
    private Date modifyDate;

    // Constructors

    /**
     * default constructor
     */
    public StiTestTable() {
    }

    /**
     * full constructor
     */
    public StiTestTable(Long companyId, String field1, String field2, String field3, Date createDate, Date modifyDate) {
        this.companyId = companyId;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    // Property accessors

    /**
     * 序号
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 序号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 企业id
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * 企业id
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 字段1
     */
    public String getField1() {
        return this.field1;
    }

    /**
     * 字段1
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    /**
     * 字段2
     */
    public String getField2() {
        return this.field2;
    }

    /**
     * 字段2
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * 字段3
     */
    public String getField3() {
        return this.field3;
    }

    /**
     * 字段3
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }

    /**
     * 创建时间
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新时间
     */
    public Date getModifyDate() {
        return this.modifyDate;
    }

    /**
     * 更新时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

}