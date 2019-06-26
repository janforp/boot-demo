package com.janita.design.c9迭代器与组合模式.version2组合模式;

import java.util.Iterator;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-26 - 16:39
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
