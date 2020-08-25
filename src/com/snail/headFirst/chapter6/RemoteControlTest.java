package com.snail.headFirst.chapter6;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:19
 */
public class RemoteControlTest {



    public static void main(String[] args) {
        //调用者
        SimpleRemoteControl remote=new SimpleRemoteControl();

        Light light=new Light();
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
