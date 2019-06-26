package com.janita.design.c9迭代器与组合模式.version2组合模式;

import java.util.Iterator;
import java.util.Stack;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-26 - 16:35
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        if (!hasNext()) {
            return null;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent component = iterator.next();
        if (component instanceof Menu) {
            stack.push(component.createIterator());
        }
        return component;
    }
}
