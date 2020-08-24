package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:08
 */
public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
