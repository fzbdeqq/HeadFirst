package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.request.CeilingFan;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 9:59
 */
public class CeilingFanOnCommand implements Command {

   private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
