package com.snail.headFirst.chapter4.product;

import java.util.ArrayList;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 19:53
 */
public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();
    public void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough....");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings:");
        toppings.stream().forEach(item-> System.out.println("    "+item));
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
