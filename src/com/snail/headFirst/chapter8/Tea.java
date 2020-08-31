package com.snail.headFirst.chapter8;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/31 17:43
 */
public class Tea extends CaffeineBeverage{

//    void prepareRecipe(){
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }

//    public void boilWater(){
//        System.out.println("Boiling Water");
//    }

//    public void steepTeaBag() {
//        System.out.println("Steeping the Tea");
//    }

//    public void pourInCup() {
//        System.out.println("Pouring In Cup");
//    }

//    public void addLemon() {
//        System.out.println("Adding Lemon");
//    }




    @Override
    protected void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
