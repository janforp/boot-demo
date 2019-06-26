package com.janita.design.c9迭代器与组合模式.version2组合模式;

import java.util.Iterator;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 20:51
 */
public abstract class MenuComponent {

    /******** 组合的方法 ********/

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /****** 单项的方法 ******/

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> createIterator();
}
