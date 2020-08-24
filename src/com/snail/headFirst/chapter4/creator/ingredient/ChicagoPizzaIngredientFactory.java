package com.snail.headFirst.chapter4.creator.ingredient;

import com.snail.headFirst.chapter4.product.ingredient.*;
import com.snail.headFirst.chapter4.product.ingredient.veggies.BlackOlives;
import com.snail.headFirst.chapter4.product.ingredient.veggies.EggPlant;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Spinach;
import com.snail.headFirst.chapter4.product.ingredient.veggies.Veggies;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 22:17
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[]veggies={new BlackOlives(),
                new Spinach(),
                new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
