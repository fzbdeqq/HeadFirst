package com.snail.headFirst.chapter7.adapter.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 18:09
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration){
        this.enumeration=enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
