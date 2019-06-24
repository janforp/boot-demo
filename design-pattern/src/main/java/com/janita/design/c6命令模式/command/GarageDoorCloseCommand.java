package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.GarageDoor;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 10:49
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
