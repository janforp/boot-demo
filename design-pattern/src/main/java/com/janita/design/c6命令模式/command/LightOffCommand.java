package com.janita.design.c6命令模式.command;

import com.janita.design.c6命令模式.product.Light;

/**
 * 类说明：打开等的命令，该命令持有他控制的对象，在此是：light，说明他控制灯
 *
 * @author zhucj
 * @since 2019-06-24 - 10:22
 */
public class LightOffCommand implements Command {

    /**
     * 命令的接收者，动作的真正支持者
     */
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
