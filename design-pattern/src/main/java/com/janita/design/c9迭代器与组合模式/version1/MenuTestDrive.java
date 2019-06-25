package com.janita.design.c9迭代器与组合模式.version1;

import java.util.ArrayList;
import java.util.List;

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
        CafeMenu cafeMenu = new CafeMenu();

        List<Menu> menuList = new ArrayList<>(3);
        menuList.add(pancakeHouseMenu) ;
        menuList.add(dinnerMenu);
        menuList.add(cafeMenu);
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
