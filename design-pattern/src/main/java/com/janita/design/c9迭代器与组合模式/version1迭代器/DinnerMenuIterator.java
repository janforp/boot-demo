package com.janita.design.c9迭代器与组合模式.version1迭代器;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:29
 */
public class DinnerMenuIterator implements java.util.Iterator<MenuItem> {

    MenuItem[] items;
    int positon = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return positon < items.length && items[positon] != null;
    }

    @Override
    public MenuItem next() {
        return items[positon ++];
    }
}
