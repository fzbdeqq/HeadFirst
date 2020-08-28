package com.snail.headFirst.chapter6;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 9:55
 */
public class CeilingFan {
    String name;
    public CeilingFan(String name) {
        this.name=name;
    }

    public void off() {
        System.out.println("CeilingFan off");
    }

    public void on() {
        System.out.println("CeilingFan on");
    }
}
