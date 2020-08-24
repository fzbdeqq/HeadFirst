package com.snail.headFirst.chapter4.product;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:08
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name="Chicago Style Sauce and Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
