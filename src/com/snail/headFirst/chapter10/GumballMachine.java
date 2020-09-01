package com.snail.headFirst.chapter10;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 19:15
 */
public class GumballMachine {
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;

    int state=SOLD;
    int count=0;

    public GumballMachine(int count){
        this.count=count;
        if(count>0){
            state=NO_QUARTER;
        }
    }
    //投币
    public void insertQuarter(){
        //有
        if(state==HAS_QUARTER){
            System.out.println("you can't insert another quarter");

        }else if(state==NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("you inserted a quarter");
        }else if(state==SOLD_OUT){
            System.out.println("you can't insert a quarter,the machine is sold out");
        }else if(state==SOLD){
            System.out.println("please wait,we're already giving you gumball");
        }
    }

    /**
     * 退回
     */
    public void ejectQuarter(){
        if(state==HAS_QUARTER){

            System.out.println("you can't insert another quarter");
            state=NO_QUARTER;

        }else if(state==NO_QUARTER){

            System.out.println("you inserted a quarter");

        }else if(state==SOLD_OUT){

            System.out.println("Sorry,you already turned the crank");

        }else if(state==SOLD){

            System.out.println("you can't eject,you haven't inserted a quarter yet ");
        }
    }

    /**
     * 转动
     */
    public void turnCrank(){
        if(state==HAS_QUARTER){

            System.out.println("you turned...");
            state=SOLD;
            dispense();

        }else if(state==NO_QUARTER){

            System.out.println("you turned but there's no quarter ");

        }else if(state==SOLD_OUT){

            System.out.println("you turned,but there are no gumballs");

        }else if(state==SOLD){

            System.out.println("Turning twice doesn't get you another gumball!");
        }
    }

    public void dispense(){
        if(state==HAS_QUARTER){

            System.out.println("no gumball dispensed");

        }else if(state==NO_QUARTER){

            System.out.println("you need to pay first");

        }else if(state==SOLD_OUT){

            System.out.println("no gumball dispensed");

        }else if(state==SOLD){

            System.out.println("A gumball comes rolling out the slot");
            count=count-1;
            if(count==0){
                System.out.println("Oops ,out of gumballs!");
                state=SOLD_OUT;
            }else {
                state=NO_QUARTER;
            }
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
