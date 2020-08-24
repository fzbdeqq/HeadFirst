package com.snail.headFirst.chapter3;

public abstract class Beverage {
//    小杯
    public final static Integer TALL=1;
//    大杯
    public final static Integer GRANDE=2;
//    超大杯
    public final static Integer VENTI=3;

    protected String description = "Unknown Beverage";

    protected int size = TALL;

    public String getDescription() {
        return description;
    }

    /**
     * 计费：变化部分
     * @return
     */
    public abstract double cost();

    /**
     *
     * @return
     */
    public abstract int getSize();
}
