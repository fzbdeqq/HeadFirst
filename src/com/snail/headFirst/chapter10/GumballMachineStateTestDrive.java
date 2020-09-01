package com.snail.headFirst.chapter10;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 19:46
 */
public class GumballMachineStateTestDrive {
    public static void main(String[] args) {
        GumballMachineState gumballMachineState=new GumballMachineState(5);
        System.out.println(gumballMachineState);

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        System.out.println(gumballMachineState);

        gumballMachineState.insertQuarter();
        gumballMachineState.ejectQuarter();
        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();
        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();
//        gumballMachineState.insertQuarter();
//        gumballMachineState.turnCrank();
//        gumballMachineState.insertQuarter();
        System.out.println(gumballMachineState);


    }
}
