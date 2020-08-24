package com.snail.headFirst.chapter4.creator;

import com.snail.headFirst.chapter4.product.*;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 19:53
 */
public abstract class PizzaStore {

//    SimplePizzaFactory simplePizzaFactory=null;
//
//    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
//        this.simplePizzaFactory=simplePizzaFactory;
//    }

    public Pizza orderPizza(String type){
//        Pizza pizza = simplePizzaFactory.createPizza(type);
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 移回create方法，让子类自己创建
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
