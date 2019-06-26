package com.janita.design.c9迭代器与组合模式.version1迭代器;

import java.util.Hashtable;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 18:55
 */
public class CafeMenuIterator implements java.util.Iterator<MenuItem> {

    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenuIterator(Hashtable<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.keySet().iterator().hasNext();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(menuItems.keySet().iterator().next());
    }
}
