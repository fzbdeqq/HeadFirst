package com.snail.headFirst.chapter3.condiment;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 调料,装饰者
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    @Override
    public int getSize(){
        return 0;
    };
}
