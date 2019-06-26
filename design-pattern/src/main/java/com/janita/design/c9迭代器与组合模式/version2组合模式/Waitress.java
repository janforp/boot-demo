package com.janita.design.c9迭代器与组合模式.version2组合模式;

import java.util.Iterator;

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

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
