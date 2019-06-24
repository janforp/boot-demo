package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.CellingFan;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:49
 */
public class CellingFanOnCommand implements Command {

    private CellingFan fan;

    public CellingFanOnCommand(CellingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
