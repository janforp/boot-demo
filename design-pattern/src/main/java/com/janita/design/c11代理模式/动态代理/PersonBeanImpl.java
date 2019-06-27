package com.janita.design.c11代理模式.动态代理;

/**
 * 类说明：
 * <p>
 * 希望顾客可以修改自己的信息，但是不能修改自己的评分
 * </p>
 * <p>
 * 但是自己无法修改自己的评分，其他人可以修改自己的评分
 * </p>
 *
 * @author zhucj
 * @since 2019-06-27 - 21:39
 */
public class PersonBeanImpl implements PersonBean {

    private String name;

    private String gender;

    private String interests;

    private int rating;

    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
