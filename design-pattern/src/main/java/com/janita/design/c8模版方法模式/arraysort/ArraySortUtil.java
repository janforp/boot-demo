package com.janita.design.c8模版方法模式.arraysort;

import lombok.experimental.UtilityClass;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 15:39
 */
@UtilityClass
public class ArraySortUtil {

    static <T extends Comparable<T>> void sort(T[] objects) {
        T[] aux = objects.clone();
        mergeSort(aux, objects, 0, objects.length, 0);
    }

    /**
     * 这个算是一个模版方法,他控制了排序的算法，把部分步骤交给其他的类去做，此处是 compareTo() 函数
     */
    private static <T extends Comparable<T>> void mergeSort(T[] src, T[] desc, int low, int high, int off) {
        for (int i = low; i < high; i++) {
            for (int j = i; j > low && desc[j - 1].compareTo(desc[j]) > 0; j--) {
                swap(desc, j, j - 1);
            }
        }
    }

    private static void swap(Object[] objects, int src, int dest) {
        Object temp;
        temp = objects[src];
        objects[src] = objects[dest];
        objects[dest] = temp;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 3, 4, 2};
        sort(integers);
        for (final Integer integer : integers) {
            System.out.println(integer.intValue());
        }
    }
}
