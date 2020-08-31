package com.snail.headFirst.chapter7.facade.module;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 18:27
 */
public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD Player to Top-O-Line DVD Player:"+dvd.getMovie());
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on(5 speakers,1 subwoofer)");
    }

    public void setVolume(int i) {
        System.out.println("Top-O-Line Amplifier setting volume to"+i);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}
