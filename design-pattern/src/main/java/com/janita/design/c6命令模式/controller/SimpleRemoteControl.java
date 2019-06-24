package com.janita.design.c6命令模式.controller;

import com.janita.design.c6命令模式.command.Command;

/**
 * 类说明：遥控器的 一个插槽持有命令，这个命令控制一个装置
 *
 * @author zhucj
 * @since 2019-06-24 - 10:25
 */
public class SimpleRemoteControl {

    private Command cellingLightSlot;

    public void setComment(Command slot) {
        this.cellingLightSlot = slot;
    }

    public void buttonWasPressed() {
        //按下遥控器的时候，委托命令对象去执行相关的操作
        cellingLightSlot.execute();
    }
}
