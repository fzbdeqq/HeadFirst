package com.snail.headFirst.chapter7.adapter.facade;

import com.snail.headFirst.chapter7.adapter.facade.module.*;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 18:43
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp=new Amplifier();
        Tuner tuner=new Tuner();
        DvdPlayer dvd=new DvdPlayer();
        CdPlayer cd=new CdPlayer();
        Projector projector=new Projector();
        TheaterLihts lights=new TheaterLihts();
        Screen screen=new Screen();
        PopcornPopper popper=new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amp,tuner,dvd,cd,projector,lights,screen,popper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        System.out.println("------------");
        homeTheaterFacade.endMovie();
    }
}
