package com.snail.headFirst.chapter1.stable;

import com.snail.headFirst.chapter1.behavior.impl.FlyWithWings;
import com.snail.headFirst.chapter1.behavior.impl.Quack;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:43
 * @Version 1.0
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck ");
    }
}
