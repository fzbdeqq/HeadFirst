package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 意浓
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
