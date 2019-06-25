package com.janita.design.c9迭代器与组合模式;

import lombok.AllArgsConstructor;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 17:29
 */
@AllArgsConstructor
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n ---- \nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> itemIterator) {
        while (itemIterator.hasNext()) {
            MenuItem next = itemIterator.next();
            System.out.println(next.getName() + " ,");
            System.out.println(next.getPrice() + " ,");
            System.out.println(next.getDescription() + " ,");
        }
    }

}
