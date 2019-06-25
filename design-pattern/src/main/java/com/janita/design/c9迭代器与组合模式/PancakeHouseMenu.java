package com.janita.design.c9迭代器与组合模式;

import java.util.ArrayList;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:24
 */
public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;
    int postion = 0;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fired eggs, and sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancake made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Deprecated
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
