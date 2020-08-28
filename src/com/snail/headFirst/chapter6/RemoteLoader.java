package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.*;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/26 22:34
 */
public class RemoteLoader {
    public static void main(String[] args) {


        Light livingRoomLight=new Light("Living Room");
        Light kitchenLight=new Light("Kitchen");

        CeilingFan ceilingFan=new CeilingFan("Living Room");
        GarageDoor garageDoor=new GarageDoor("");
        Stereo stereo=new Stereo("Living Room");

        Command livingRoomLightOn=new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff=new LightOffCommand(livingRoomLight);
        Command kitchenLightOn=new LightOnCommand(kitchenLight);
        Command kitchenLightOff=new LightOffCommand(kitchenLight);

        Command ceilingFanOn=new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOff=new CeilingFanOffCommand(ceilingFan);
        Command garageDoorUp=new GarageDoorUpCommand(garageDoor);
        Command garageDoorDown=new GarageDoorDownCommand(garageDoor);

        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

    }
}
