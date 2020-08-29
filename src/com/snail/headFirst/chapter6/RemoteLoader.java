package com.snail.headFirst.chapter6;

import com.snail.headFirst.chapter6.command.*;
import com.snail.headFirst.chapter6.request.CeilingFan;
import com.snail.headFirst.chapter6.request.GarageDoor;
import com.snail.headFirst.chapter6.request.Light;
import com.snail.headFirst.chapter6.request.Stereo;

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
        //灯
        Command livingRoomLightOn=new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff=new LightOffCommand(livingRoomLight);
        Command kitchenLightOn=new LightOnCommand(kitchenLight);
        Command kitchenLightOff=new LightOffCommand(kitchenLight);
        //吊扇
        Command ceilingFanHigh=new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOn=new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOff=new CeilingFanOffCommand(ceilingFan);
        //车库门
        Command garageDoorUp=new GarageDoorUpCommand(garageDoor);
        Command garageDoorDown=new GarageDoorDownCommand(garageDoor);
        //音响
        Command stereoOnWithCD=new StereoOnWithCDCommand(stereo);
        Command StereoOff=new StereoOffCommand(stereo);

        RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, StereoOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("--------------");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println("--------------");
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        System.out.println("--------------");
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }
}
