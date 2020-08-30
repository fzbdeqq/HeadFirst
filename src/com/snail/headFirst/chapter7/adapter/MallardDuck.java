package com.snail.headFirst.chapter7.adapter;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 17:15
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
