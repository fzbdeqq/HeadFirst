package com.snail.headFirst.chapter10;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 19:57
 */
public interface State {
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;

    int state=SOLD_OUT;
    int count=0;

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
