package com.snail.headFirst.chapter11.proxy;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/3 8:56
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("代理请求machine");
        System.out.println("Gumball Machine:"+machine.getLocation());

    }
}
