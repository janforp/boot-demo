package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.Stereo;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:39
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
