package com.snail.headFirst.chapter1.stable;

import com.snail.headFirst.chapter1.behavior.impl.FlyNoWay;
import com.snail.headFirst.chapter1.behavior.impl.Quack;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:37
 * @Version 1.0
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
