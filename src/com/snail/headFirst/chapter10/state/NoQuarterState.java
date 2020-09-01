package com.snail.headFirst.chapter10.state;

import com.snail.headFirst.chapter10.GumballMachineState;
import com.snail.headFirst.chapter10.state.State;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/1 21:41
 */
public class NoQuarterState implements State {
    GumballMachineState gumballMachineState;

    public NoQuarterState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachineState.setState(gumballMachineState.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't  eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there's no  quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
