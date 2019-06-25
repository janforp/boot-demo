package com.janita.design.c9迭代器与组合模式.version1;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 17:29
 */
@AllArgsConstructor
public class Waitress {


    List<Menu> menuList;
    // PancakeHouseMenu pancakeHouseMenu;
    //
    // DinnerMenu dinnerMenu;
    //
    // CafeMenu cafeMenu;

    public void printMenu() {
        for (final Menu menu : menuList) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(java.util.Iterator<MenuItem> itemIterator) {
        while (itemIterator.hasNext()) {
            MenuItem next = itemIterator.next();
            System.out.println(next.getName() + " ,");
            System.out.println(next.getPrice() + " ,");
            System.out.println(next.getDescription() + " ,");
        }
    }

}
