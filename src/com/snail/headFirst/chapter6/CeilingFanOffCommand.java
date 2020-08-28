package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.Command;

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
}
