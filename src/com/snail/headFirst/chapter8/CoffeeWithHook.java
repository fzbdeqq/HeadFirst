package com.snail.headFirst.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/31 17:43
 */
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar And Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer=getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }

    }

    private String getUserInput() {
        String answer=null;
        System.out.println("would you like milk and sugar with your coffee(y/n)?");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try {
            answer=in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(answer==null){
            answer="no";
        }
        return answer;
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
