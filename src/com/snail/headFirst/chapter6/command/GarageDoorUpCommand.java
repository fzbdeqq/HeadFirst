package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.request.GarageDoor;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 10:07
 */
public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
