package com.snail.headFirst.chapter4;

import com.snail.headFirst.chapter4.creator.ChicagoStylePizzaStore;
import com.snail.headFirst.chapter4.creator.NYStylePizzaStore;
import com.snail.headFirst.chapter4.creator.PizzaStore;
import com.snail.headFirst.chapter4.product.Pizza;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:18
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYStylePizzaStore();
        PizzaStore chicagoStore=new ChicagoStylePizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());

        System.out.println("---------------");

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName());
    }
}
