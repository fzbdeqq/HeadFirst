package com.snail.headFirst.chapter6.command;

import com.snail.headFirst.chapter6.request.CeilingFan;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/27 10:03
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed==CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed==CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed==CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
