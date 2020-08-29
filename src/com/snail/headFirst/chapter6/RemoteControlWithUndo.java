package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.Command;
import com.snail.headFirst.chapter6.command.NoCommand;

import java.util.Arrays;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/25 22:50
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public RemoteControlWithUndo(){
        onCommands=new Command[7];
        offCommands=new Command[7];

        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonWasPushed(int slot){
        if(onCommands[slot]!=null){
            onCommands[slot].execute();
            undoCommand=onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot){
        if(offCommands[slot]!=null){
            offCommands[slot].execute();
            undoCommand=offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
