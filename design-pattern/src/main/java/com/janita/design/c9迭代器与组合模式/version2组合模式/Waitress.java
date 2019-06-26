package com.janita.design.c9迭代器与组合模式.version2组合模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-26 - 16:22
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void prinMenu() {
        allMenus.print();
    }
}
