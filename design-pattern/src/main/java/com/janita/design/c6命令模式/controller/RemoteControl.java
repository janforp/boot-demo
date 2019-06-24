package com.janita.design.c6命令模式.controller;

import com.janita.design.c6命令模式.command.Command;
import com.janita.design.c6命令模式.command.NoCommand;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 11:28
 */
public class RemoteControl {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command no = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = no;
            offCommands[i] = no;
        }
        undoCommand = no;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtionWasPressed() {
        undoCommand.execute();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------- Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return buffer.toString();
    }
}
