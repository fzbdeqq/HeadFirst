package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.GarageDoor;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 10:09
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
