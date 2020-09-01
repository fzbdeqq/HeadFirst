package com.snail.headFirst.chapter9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 16:20
 */
public class CafeMenu implements Menu {
    Map meunItems=new HashMap();

    public CafeMenu() {
        addItem("Cafe",
                "(Cafe') Cafe",
                true,
                2.99);
        addItem("Tea",
                "(Tea') Tea",
                true,
                2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        meunItems.put(name,menuItem);
    }

    @Override
    public Iterator createIterator() {
        return meunItems.values().iterator();
    }
}
