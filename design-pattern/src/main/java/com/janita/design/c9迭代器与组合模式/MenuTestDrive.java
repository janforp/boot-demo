package com.janita.design.c9迭代器与组合模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 17:31
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}
