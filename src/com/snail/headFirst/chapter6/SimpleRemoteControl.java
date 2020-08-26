package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.Command;

/**
 * @Author: SnailBBB
 * @Description: 调用者 Invoker，持有一个命令对象
 * @Date 2020/8/25 11:18
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot=command;
    }

    /**
     * action
     */
    public void buttonWasPressed(){
        slot.execute();
    }
}
