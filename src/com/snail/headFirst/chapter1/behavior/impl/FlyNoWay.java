package com.snail.headFirst.chapter1.behavior.impl;

import com.snail.headFirst.chapter1.behavior.FlyBehavior;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:28
 * @Version 1.0
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
