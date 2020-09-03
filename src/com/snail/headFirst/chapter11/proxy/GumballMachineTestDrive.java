package com.snail.headFirst.chapter11.proxy;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/3 8:59
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine=new GumballMachine("代理");

        GumballMonitor gumballMonitor=new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
