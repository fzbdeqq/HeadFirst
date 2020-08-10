package com.snail.headFirst.chapter1.behavior.impl;

import com.snail.headFirst.chapter1.behavior.QuackBehavior;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:33
 * @Version 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
