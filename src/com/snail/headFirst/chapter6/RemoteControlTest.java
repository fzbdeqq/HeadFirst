package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.GarageDoorOpenCommand;
import com.snail.headFirst.chapter6.command.LightOnCommand;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:19
 */
public class RemoteControlTest {



    public static void main(String[] args) {
        //调用者
        SimpleRemoteControl remote=new SimpleRemoteControl();

        Light light=new Light("Living Room");
        LightOnCommand lightOn=new LightOnCommand(light);
//        lightOn.execute();

        GarageDoor garageDoor=new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        System.out.println("--------");
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
