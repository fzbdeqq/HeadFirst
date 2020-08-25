package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.GarageDoor;
import com.snail.headFirst.chapter6.command.Command;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:16
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door){
        this.door=door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
