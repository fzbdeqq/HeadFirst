package com.snail.headFirst.chapter3;

import com.snail.headFirst.chapter3.beverage.DarkRoast;
import com.snail.headFirst.chapter3.beverage.Espresso;
import com.snail.headFirst.chapter3.beverage.HouseBlend;
import com.snail.headFirst.chapter3.condiment.Mocha;
import com.snail.headFirst.chapter3.condiment.Soy;
import com.snail.headFirst.chapter3.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage=new Espresso(Beverage.TALL);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage2=new DarkRoast(Beverage.VENTI);
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());


        Beverage beverage3=new HouseBlend(Beverage.TALL);
        beverage3=new Soy(beverage3);
        beverage3=new Mocha(beverage3);
        beverage3=new Whip(beverage3);

        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
    }
}
