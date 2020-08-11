package com.snail.headFirst.chapter3.condiment;

import com.snail.headFirst.chapter3.Beverage;

/**
 * 调料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
