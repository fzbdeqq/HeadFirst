package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.Command;
import com.snail.headFirst.chapter6.command.LightOffCommand;
import com.snail.headFirst.chapter6.command.LightOnCommand;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/26 22:34
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
        Light livingRoomLight=new Light();
        Command lightOn=new LightOnCommand(livingRoomLight);
        Command lightOff=new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, lightOn, lightOff);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
