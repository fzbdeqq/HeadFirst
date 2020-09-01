package com.snail.headFirst.chapter10.state;

import com.snail.headFirst.chapter10.GumballMachineState;
import com.snail.headFirst.chapter10.state.State;

import java.util.Random;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/1 21:41
 */
public class HasQuarterState implements State {
    GumballMachineState gumballMachineState;
    Random random=new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't inserted anther quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachineState.setState(gumballMachineState.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned....");
        int winner=random.nextInt(10);
        if(winner==0&&gumballMachineState.getCount()>1){
            gumballMachineState.setState(gumballMachineState.getWinnerState());
        }else {
            gumballMachineState.setState(gumballMachineState.getSoldState());
        }


    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
