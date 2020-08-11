package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 意浓
 */
public class Decat extends Beverage {
    public Decat(){
        description="Decat";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
