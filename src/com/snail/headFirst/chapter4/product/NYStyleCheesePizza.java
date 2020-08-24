package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:06
 */
public class NYStyleCheesePizza extends Pizza {
//    public NYStyleCheesePizza() {
//        toppings.add("Grate Reggiano Cheese");
//    }
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
        toppings.add("Grate Reggiano Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);

        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();

    }
}
