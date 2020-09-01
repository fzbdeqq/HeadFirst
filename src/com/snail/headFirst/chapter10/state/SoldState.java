package com.snail.headFirst.chapter10.state;

import com.snail.headFirst.chapter10.GumballMachineState;
import com.snail.headFirst.chapter10.state.State;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/1 21:41
 */
public class SoldState implements State {
    GumballMachineState gumballMachineState;

    public SoldState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball! ");
    }

    @Override
    public void dispense() {
        gumballMachineState.releaseBall();
        if(gumballMachineState.getCount()>0){
            gumballMachineState.setState(gumballMachineState.getNoQuarterState());
        }else {
            gumballMachineState.setState(gumballMachineState.getSoldOutState());
            System.out.println("Oops, out of gumballs!");
        }

    }
}
