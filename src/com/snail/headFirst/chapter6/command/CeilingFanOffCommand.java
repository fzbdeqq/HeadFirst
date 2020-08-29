package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.command.Command;
import com.snail.headFirst.chapter6.request.CeilingFan;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 10:03
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
