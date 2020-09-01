package com.snail.headFirst.chapter10.state;

import com.snail.headFirst.chapter10.GumballMachineState;
import com.snail.headFirst.chapter10.state.State;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/1 21:41
 */
public class SoldOutState implements State {
    GumballMachineState gumballMachineState;

    public SoldOutState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You Can't inserted a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You Can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned,but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
