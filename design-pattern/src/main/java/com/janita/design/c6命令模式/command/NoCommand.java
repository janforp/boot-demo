package com.janita.design.c6命令模式.command;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:29
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("错误的操作");
    }

    @Override
    public void undo() {
        System.out.println("错误的操作");
    }

    @Override
    public String toString() {
        return "没有绑定设备";
    }
}
