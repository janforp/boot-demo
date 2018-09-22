package com.boot.demo.auto.entity;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-13
 */
public class User implements java.io.Serializable {

    // Fields

    private String userId;
    private String userName;
    private Integer gender;
    private String remark;
    private Integer hasSon;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(String userId, String userName, Integer gender, String remark, Integer hasSon) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.remark = remark;
        this.hasSon = hasSon;
    }

    // Property accessors

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHasSon() {
        return this.hasSon;
    }

    public void setHasSon(Integer hasSon) {
        this.hasSon = hasSon;
    }

}