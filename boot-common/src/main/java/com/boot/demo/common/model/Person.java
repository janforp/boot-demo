package com.boot.demo.common.model;

/**
 * Created by com.janita.caffeinecache.MybatisCodeGenerate on 2017-07-11
 */
public class Person implements java.io.Serializable {

    // Fields

    private Integer id;
    private String name;
    private Integer gender;

    // Constructors

    /**
     * default constructor
     */
    public Person() {
    }

    /**
     * full constructor
     */
    public Person(String name, Integer gender) {
        this.name = name;
        this.gender = gender;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}