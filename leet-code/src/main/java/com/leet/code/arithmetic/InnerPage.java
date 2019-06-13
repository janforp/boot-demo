package com.leet.code.arithmetic;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-13 - 14:23
 */
public class InnerPage {

    private static final List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /**
     * 第一页传 1
     *
     * @param pageNo   1
     * @param pageSize 25
     */
    private static List<Integer> page(Integer pageNo, Integer pageSize) {
        int fromIndex = (pageNo - 1) * pageSize;
        int toIndex = pageNo * pageSize;
        if (pageNo * pageSize > list.size()) {
            return Lists.newArrayListWithExpectedSize(0);
        }
        return list.subList(fromIndex, toIndex);
    }

    public static void main(String[] args) {
        System.out.println(page(5, 2));
    }
}
