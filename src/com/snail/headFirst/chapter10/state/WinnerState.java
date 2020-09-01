package com.snail.headFirst.chapter10.state;

import com.snail.headFirst.chapter10.GumballMachineState;
import com.snail.headFirst.chapter10.state.State;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/1 21:41
 */
public class WinnerState implements State {
    GumballMachineState gumballMachineState;

    public WinnerState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("error");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("error");
    }

    @Override
    public void turnCrank() {
        System.out.println("error");
    }

    @Override
    public void dispense() {
        System.out.println("You're a winner! you get two gumballs for your quarter");
        gumballMachineState.releaseBall();
        if(gumballMachineState.getCount()==0){
            gumballMachineState.setState(gumballMachineState.getSoldOutState());
        }else {
            gumballMachineState.releaseBall();
            if(gumballMachineState.getCount()>0){
                gumballMachineState.setState(gumballMachineState.getNoQuarterState());
            }else {
                System.out.println("Oops,out of gumballs!");
                gumballMachineState.setState(gumballMachineState.getSoldOutState());
            }
        }
    }
}
