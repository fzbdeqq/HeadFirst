package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.Light;
import com.snail.headFirst.chapter6.command.Command;

/**
 * @Author: SnailBBB
 * @Description:把开灯行为封装成命令，让命令去执行
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
