package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 19:58
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
    }
}
