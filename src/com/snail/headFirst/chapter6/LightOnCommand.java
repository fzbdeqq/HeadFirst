package com.snail.headFirst.chapter6;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:16
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
