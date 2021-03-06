package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:08
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
    }
}
