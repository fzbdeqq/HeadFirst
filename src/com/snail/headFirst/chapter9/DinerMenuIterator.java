package com.snail.headFirst.chapter9;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 8:58
 */
public class DinerMenuIterator implements Iterator {
    int position=0;
    MenuItem[] items;

    public DinerMenuIterator(MenuItem []items) {
        this.items=items;
    }


    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position++;

        return menuItem;
    }

    @Override
    public void remove() {
        if(position<0){
            throw new IllegalStateException("You can't remove an item until you're done at least one next()");
        }
        if(items[position-1]!=null){
            for (int i=position-1;i<(items.length-1);i++){
                items[i]=items[i+1];
            }
            items[items.length-1]=null;
        }
    }
}
