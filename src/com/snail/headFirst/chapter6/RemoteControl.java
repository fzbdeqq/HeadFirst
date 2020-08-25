package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.Command;
import com.snail.headFirst.chapter6.command.NoCommand;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/25 22:50
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands=new Command[7];
        offCommands=new Command[7];

        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[7]=noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
}
