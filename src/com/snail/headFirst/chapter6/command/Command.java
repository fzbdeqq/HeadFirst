package com.snail.headFirst.chapter6.command;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/25 11:16
 */
public interface Command {
    public void execute();

    public void undo();
}
