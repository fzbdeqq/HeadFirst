package com.snail.headFirst.chapter6;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:17
 */
public class Light {

    private String name;

    public Light(String name){
        this.name=name;
    }

    public void on() {
        System.out.println("Light on:"+name);
    }

    public void off() {
        System.out.println("Light off:"+name);
    }

}
