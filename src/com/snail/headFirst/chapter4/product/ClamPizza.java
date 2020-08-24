package com.snail.headFirst.chapter4.product;

import com.snail.headFirst.chapter4.creator.ingredient.PizzaIngredientFactory;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 19:58
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);

        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
        cheese=pizzaIngredientFactory.createCheese();
        clams=pizzaIngredientFactory.createClam();
    }
}
