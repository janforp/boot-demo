package com.janita.design.c9迭代器与组合模式.version2组合模式;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-26 - 16:26
 */
public class MenuTestDrive {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        Menu dinnerMenu = new Menu("DINNER MENU", "Lunch");
        Menu cafeMenu = new Menu("CAFE MENU", "Dinner");
        Menu dessertMenu = new Menu("DESSERT MENU", "Dessert of cource");

        Menu allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sac", true, 3.89));

        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie sdsf", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.prinMenu();

    }
}
