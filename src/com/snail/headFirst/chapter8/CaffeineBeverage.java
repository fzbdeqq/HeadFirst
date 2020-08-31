package com.snail.headFirst.chapter8;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/31 17:49
 */
public abstract class CaffeineBeverage {
    /**
     * 定义算法的步骤，并允许之类为一个或多个步骤提供实现
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }



    protected void boilWater(){
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();


}
