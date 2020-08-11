package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="HouseBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
