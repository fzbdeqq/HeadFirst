package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.Stereo;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/25 22:57
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
