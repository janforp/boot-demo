package com.janita.design.c9迭代器与组合模式.version1迭代器;

import java.util.ArrayList;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:29
 */
public class PancakeHouseMenuIterator implements java.util.Iterator<MenuItem> {

    ArrayList<MenuItem> items;
    int positon = 0;

    public PancakeHouseMenuIterator( ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return positon < items.size() && items.get(positon) != null;
    }

    @Override
    public MenuItem next() {
        return items.get(positon ++);
    }
}
