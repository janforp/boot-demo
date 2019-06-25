package com.janita.design.c9迭代器与组合模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 17:17
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
