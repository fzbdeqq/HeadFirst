package com.snail.headFirst.chapter4.creator;

import com.snail.headFirst.chapter4.creator.ingredient.NYPizzaIngredientFactory;
import com.snail.headFirst.chapter4.product.*;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:04
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        NYPizzaIngredientFactory nyPizzaIngredientFactory=new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {

            pizza = new NYStyleCheesePizza(nyPizzaIngredientFactory);
            pizza.setName("NY Style Cheese Pizza");

        } else if (type.equals("greek")) {

            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {

            pizza = new NYStylePepperoniPizza();
            pizza.setName("NY Style Pepperoni Pizza");

        } else if (type.equals("clam")) {

            pizza = new NYStyleClamPizza();
            pizza.setName("NY Style Clam Pizza");

        } else if (type.equals("veggie")) {

            pizza = new NYStyleVeggiePizza();
            pizza.setName("NY Style Veggie Pizza");

        }
        return pizza;
    }
}
