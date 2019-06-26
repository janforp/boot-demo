package com.janita.design.c9迭代器与组合模式.version1迭代器;

import java.util.Hashtable;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 18:52
 */
public class CafeMenu implements Menu {

    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie Burger and Air Fries", true, 3.99);
        addItem("Soup of the day", "Soup of the day", false, 3.69);
        addItem("Burrito", "Burrito", true, 4.29);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public java.util.Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
