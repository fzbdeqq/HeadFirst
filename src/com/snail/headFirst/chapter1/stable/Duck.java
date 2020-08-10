package com.snail.headFirst.chapter1.stable;

import com.snail.headFirst.chapter1.behavior.FlyBehavior;
import com.snail.headFirst.chapter1.behavior.QuackBehavior;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:25
 * @Version 1.0
 * 多用组合、少用继承
 */
public abstract class Duck {
    /**
     * 所有的鸭子子类都继承它们
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    /**
     * 显示
     */
     public abstract void display();

     public void performFly(){
         //委托给行为类
        flyBehavior.fly();
     }
     public void performQuack(){
         quackBehavior.quack();
     }

     public void swim(){
         System.out.println("All ducks float, even decoys!");
     }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
