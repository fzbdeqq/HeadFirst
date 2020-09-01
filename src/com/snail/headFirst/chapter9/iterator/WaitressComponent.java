package com.snail.headFirst.chapter9.iterator;

import com.snail.headFirst.chapter9.composite.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:25
 */
public class WaitressComponent {
//    关心接口，而不是实现
    MenuComponent allMenus;


    public WaitressComponent(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
