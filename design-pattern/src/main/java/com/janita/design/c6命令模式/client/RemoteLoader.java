package com.janita.design.c6命令模式.client;

import com.janita.design.c6命令模式.command.CellingFanOffCommand;
import com.janita.design.c6命令模式.command.CellingFanOnCommand;
import com.janita.design.c6命令模式.command.GarageDoorCloseCommand;
import com.janita.design.c6命令模式.command.GarageDoorOpenCommand;
import com.janita.design.c6命令模式.command.LightOffCommand;
import com.janita.design.c6命令模式.command.LightOnCommand;
import com.janita.design.c6命令模式.command.StereoOffCommand;
import com.janita.design.c6命令模式.command.StereoOnWithCDCommand;
import com.janita.design.c6命令模式.controller.RemoteControl;
import com.janita.design.c6命令模式.product.CellingFan;
import com.janita.design.c6命令模式.product.GarageDoor;
import com.janita.design.c6命令模式.product.Light;
import com.janita.design.c6命令模式.product.Stereo;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:50
 */
public class RemoteLoader {

    public static void main(String[] args) {

        //遥控器
        RemoteControl remoteControl = new RemoteControl();

        /******* 被控制的设备 ******/
        Light livingRoomLight = new Light("卧室灯");
        Light kitchenLight = new Light("触发灯");
        CellingFan fan = new CellingFan("卧室风扇");
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo("卧室音响");

        /******* 命令对象 ******/

        LightOnCommand livingOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitLightOffCommand = new LightOffCommand(kitchenLight);

        CellingFanOnCommand cellingFanOnCommand = new CellingFanOnCommand(fan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(fan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(door);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingOnCommand, livingOffCommand);
        remoteControl.setCommand(1, kitLightOnCommand, kitLightOffCommand);
        remoteControl.setCommand(2, cellingFanOnCommand, cellingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);

        System.out.println(remoteControl);

        /******* 按下遥控器的按钮 ******/

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}
