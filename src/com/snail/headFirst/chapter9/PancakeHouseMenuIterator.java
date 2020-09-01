package com.snail.headFirst.chapter9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 8:51
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        return menuItems.iterator().hasNext();
    }

    @Override
    public Object next() {
        return null;
    }
}
