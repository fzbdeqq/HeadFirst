package com.snail.headFirst.chapter9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 8:51
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs,sausage",
                true,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes with scrambled eggs,toast",
                true,
                3.99);

        addItem("Waffles",
                "Waffles,with you choice of blueberries or strawberries",
                true,
                2.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }
//    public ArrayList getMenuItems(){
//        return menuItems;
//    }

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
