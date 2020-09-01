package com.snail.headFirst.chapter9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:25
 */
public class WaitressList {
//    关心接口，而不是实现
    ArrayList menus;


    public WaitressList(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator=menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu= (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
