package com.snail.headFirst.chapter7.adapter.facade.module;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 18:29
 */
public class DvdPlayer {
    String movie;
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        this.movie=movie;
        System.out.println("Top-O-Line DVD Player Playing"+movie);
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stop"+movie);
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public String getMovie() {
        return movie;
    }
}
