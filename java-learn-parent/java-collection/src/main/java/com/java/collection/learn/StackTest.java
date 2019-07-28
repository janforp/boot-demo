package com.java.collection.learn;

import java.util.Stack;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-26 - 17:23
 */
public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        Integer peek = stack.peek();
        print(peek);
        Integer pop = stack.pop();
        print(pop);
        stack.push(5);
        int search = stack.search(1);
        print(search);

        print(stack);
    }
}
