package com.snail.headFirst.chapter8;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/31 17:43
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar And Milk");
    }

//    void prepareRecipe(){
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMilk();
//    }
//    public void boilWater(){
//        System.out.println("Boil Water");
//    }
//
//    public void brewCoffeeGrinds() {
//        System.out.println("Dripping Coffee through filter");
//    }
//
//    public void pourInCup() {
//        System.out.println("Pouring In Cup");
//    }
//
//    public void addSugarAndMilk() {
//        System.out.println("Adding Sugar And Milk");
//    }





}
