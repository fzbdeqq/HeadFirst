package com.snail.headFirst.chapter9.iterator;

import com.snail.headFirst.chapter9.composite.MenuComponent;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:37
 */
public class MenuComponentTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu=new Menu("Pancake","Breakfast");

        MenuComponent dinerMenu=new Menu("Diner menu","Lunch");

        MenuComponent cafeMenu=new Menu("CAFE MENU","Diner");

        MenuComponent dessertMenu=new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus=new Menu("ALL Menus","all menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie",
                "Apple pie with Marinara Sauce",
                true,
                1.59));
        WaitressComponent waitressComponent=new WaitressComponent(allMenus);
        waitressComponent.printMenu();


    }
}
