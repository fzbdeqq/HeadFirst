package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.request.Stereo;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/28 22:27
 */
public class StereoOffCommand implements Command {
    Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
