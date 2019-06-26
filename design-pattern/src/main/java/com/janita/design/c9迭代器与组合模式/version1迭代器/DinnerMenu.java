package com.janita.design.c9迭代器与组合模式.version1迭代器;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:29
 */
public class DinnerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    int currPosition = 0;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }

    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public java.util.Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
