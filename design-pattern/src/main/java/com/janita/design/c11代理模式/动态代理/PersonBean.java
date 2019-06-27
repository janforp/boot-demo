package com.janita.design.c11代理模式.动态代理;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 21:37
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
