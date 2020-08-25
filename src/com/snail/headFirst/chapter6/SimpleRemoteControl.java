package com.snail.headFirst.chapter6;

/**
 * @Author: SnailBBB
 * @Description: 调用者
 * @Date 2020/8/25 11:18
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
