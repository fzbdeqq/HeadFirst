package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(int size){

        this.size=size;

        description="HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public int getSize() {
        return size;
    }
}
