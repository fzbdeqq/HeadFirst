package com.snail.headFirst.chapter10;

import com.snail.headFirst.chapter10.state.*;

/**
 * @Author: SnailBBB
 * @Description: context
 * @Date 2020/9/1 19:15
 */
public class GumballMachineState {

    State noQuarterState;
    State soldOutState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state=soldOutState;
    int count=0;

    public GumballMachineState(int numberGumballs){
        this.noQuarterState=new NoQuarterState(this);
        this.soldOutState=new SoldOutState(this);
        this.hasQuarterState=new HasQuarterState(this);
        this.soldState=new SoldState(this);
        this.winnerState=new WinnerState(this);
        this.count=numberGumballs;
        if(numberGumballs>0){
            state=noQuarterState;
        }
    }
    //投币
    public void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 退回
     */
    public void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 转动
     */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    /**
     * 对象在内部修改状态时，改变了它的行为
     * @param state
     */
    public void setState(State state){
        this.state=state;
    }
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot....");
        if(count!=0){
            count=count-1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState(){
        return winnerState;
    }
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
