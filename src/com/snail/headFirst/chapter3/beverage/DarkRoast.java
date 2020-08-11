package com.snail.headFirst.chapter3.beverage;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 深度烘焙
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="DarkRoast";
    }
    @Override
    public double cost() {
        return .99;
    }
}
