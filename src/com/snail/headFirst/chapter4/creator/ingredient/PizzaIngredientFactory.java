package com.snail.headFirst.chapter4.creator.ingredient;

import com.snail.headFirst.chapter4.product.ingredient.*;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Veggies;

/**
 * @Author: SnailBBB
 * @Description: 抽象工厂模式
 * @Date: 2020/8/24 20:39
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
