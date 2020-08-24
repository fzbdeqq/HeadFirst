package com.snail.headFirst.chapter4.creator;

import com.snail.headFirst.chapter4.creator.ingredient.ChicagoPizzaIngredientFactory;
import com.snail.headFirst.chapter4.product.*;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 20:04
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory=new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }
}
