package com.snail.headFirst.chapter9.iterator;

import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 17:38
 */
public class CompositeIterator implements Iterator {

    public CompositeIterator(Iterator iterator) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
