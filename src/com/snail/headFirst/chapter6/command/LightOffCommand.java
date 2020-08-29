package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.request.Light;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:16
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
