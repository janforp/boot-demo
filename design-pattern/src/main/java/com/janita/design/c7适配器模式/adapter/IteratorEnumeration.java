package com.janita.design.c7适配器模式.adapter;

import lombok.Data;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 类说明：一个用于适配老版本的 枚举 的适配器，让客户的代码可以使用版本的迭代器
 *
 * @author zhucj
 * @since 2019-06-24 - 16:15
 */
@Data
public class IteratorEnumeration<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
