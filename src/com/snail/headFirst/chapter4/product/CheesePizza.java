package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 19:56
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing "+name);

        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
        cheese=pizzaIngredientFactory.createCheese();
    }
}
