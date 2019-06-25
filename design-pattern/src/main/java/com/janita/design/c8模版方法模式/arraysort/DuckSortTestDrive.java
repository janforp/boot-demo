package com.janita.design.c8模版方法模式.arraysort;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:00
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = new Duck[]{
          new Duck("Daffy", 8),
          new Duck("Dewey", 2),
          new Duck("Howard", 7)
        };
        ArraySortUtil.sort(ducks);
        for (final Duck duck : ducks) {
            System.out.println(duck);
        }
    }

}
