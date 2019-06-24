package com.janita.design.c6命令模式.controller;

import com.janita.design.c6命令模式.command.Command;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 10:54
 */
public class GarageDoorController {

    private Command slot;

    public GarageDoorController(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
