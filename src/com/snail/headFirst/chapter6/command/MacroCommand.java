package com.snail.headFirst.chapter6.command;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/29 22:19
 */
public class MacroCommand implements Command {
    Command[]commands;
    public MacroCommand(Command []commands){
        this.commands=commands;
    }
    @Override
    public void execute() {
        for (int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}
