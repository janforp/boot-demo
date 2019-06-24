package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.GarageDoor;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 10:49
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
garageDoor.down();
    }
}
