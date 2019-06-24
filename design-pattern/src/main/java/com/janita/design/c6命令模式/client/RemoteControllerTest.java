package com.janita.design.c6命令模式.client;

import com.janita.design.c6命令模式.command.GarageDoorOpenCommand;
import com.janita.design.c6命令模式.command.LightOnCommand;
import com.janita.design.c6命令模式.controller.SimpleRemoteControl;
import com.janita.design.c6命令模式.product.GarageDoor;
import com.janita.design.c6命令模式.product.Light;

/**
 * 类说明：命令模式的客户，由他触发操作
 *
 * @author zhucj
 * @since 2019-06-24 - 10:27
 */
public class RemoteControllerTest{

    public static void main(String[] args) {
        //遥控器
        SimpleRemoteControl control = new SimpleRemoteControl();
        //控制灯的命令
        LightOnCommand command = new LightOnCommand(new Light("Celling light"));
        //把命令设置到遥控器的第一个插槽
        control.setComment(command);
        //客户按下遥控器
        control.buttonWasPressed();

        //遥控器的插槽上的命令可以更换，类似的我们可以进行命令的流水操作
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        control.setComment(garageDoorOpenCommand);
        control.buttonWasPressed();
    }
}
