package com.snail.headFirst.chapter8;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/8/31 17:56
 */
public class BeverageDriverTest {
    public static void main(String[] args) {
        CaffeineBeverage beverage=new Tea();
        beverage.prepareRecipe();
        System.out.println("-------");
        beverage=new Coffee();
        beverage.prepareRecipe();
        System.out.println("-------");
        beverage=new CoffeeWithHook();
        beverage.prepareRecipe();
    }
}
