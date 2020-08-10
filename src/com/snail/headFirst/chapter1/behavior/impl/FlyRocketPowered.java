package com.snail.headFirst.chapter1.behavior.impl;

import com.snail.headFirst.chapter1.behavior.FlyBehavior;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:50
 * @Version 1.0
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
