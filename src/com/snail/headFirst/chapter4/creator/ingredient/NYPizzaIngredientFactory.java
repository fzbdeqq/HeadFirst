package com.snail.headFirst.chapter4.creator.ingredient;

import com.snail.headFirst.chapter4.product.ingredient.*;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Garlic;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Onion;
import com.snail.headFirst.chapter4.product.ingredient.veggies.RedPaper;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Veggies;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 22:17
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[]veggies={new Garlic(),new Onion(),new Mushroom(),new RedPaper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
