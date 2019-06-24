package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.Stereo;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:39
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
