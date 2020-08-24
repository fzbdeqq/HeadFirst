package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 意浓
 */
public class Decat extends Beverage {

    public Decat(int size){
        this.size=size;
        description="Decat";
    }
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public int getSize() {
        return size;
    }
}
