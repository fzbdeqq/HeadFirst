package com.snail.headFirst.chapter6.request;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/25 22:58
 */
public class Stereo {

    String name;

    Integer volume;

    public Stereo(String name) {
        this.name=name;
    }

    public void on() {
        System.out.println("Stereo off:"+name);
    }

    public void setCD() {
        System.out.println("Stereo Set CD");
    }

    public void setVolume(int i) {
        this.volume=i;
        System.out.println("Stereo volume:"+volume);
    }

    public void off() {
        System.out.println("Stereo off:"+name);
    }
}
