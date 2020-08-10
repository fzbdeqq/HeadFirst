package com.snail.headFirst.chapter1.behavior.impl;

import com.snail.headFirst.chapter1.behavior.QuackBehavior;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:35
 * @Version 1.0
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
