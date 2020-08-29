package com.snail.headFirst.chapter6.request;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 9:55
 */
public class CeilingFan {
    String location;
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    int speed;
    public CeilingFan(String location) {
        this.location=location;
        speed=OFF;
    }
    public int getSpeed(){
        return speed;
    }
    public void high(){
        speed=HIGH;
    }
    public void medium(){
        speed=MEDIUM;
    }
    public void low(){
        speed=LOW;
    }


    public void off() {
        speed=OFF;
    }

    public void on() {
        System.out.println("CeilingFan on");
    }
}
