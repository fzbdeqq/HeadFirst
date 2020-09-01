package com.snail.headFirst.chapter9;

import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:25
 */
public class Waitress {
//    关心接口，而不是实现
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu=cafeMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        Iterator cafeIterator=cafeMenu.createIterator();

        System.out.println("Menu\n----\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
        System.out.println("\nDinner");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
