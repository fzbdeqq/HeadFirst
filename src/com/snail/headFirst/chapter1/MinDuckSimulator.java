package com.snail.headFirst.chapter1;

import com.snail.headFirst.chapter1.behavior.impl.FlyRocketPowered;
import com.snail.headFirst.chapter1.stable.Duck;
import com.snail.headFirst.chapter1.stable.MallardDuck;
import com.snail.headFirst.chapter1.stable.ModelDuck;

/**
 * @Author fuzhibin
 * @Date 2020/8/10 17:36
 * @Version 1.0
 */
public class MinDuckSimulator {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        System.out.println("---------");

        Duck model=new ModelDuck();
        //第一次调用委托给FlyNoWay
        model.performFly();
        //设置改变的行为
        model.setFlyBehavior(new FlyRocketPowered());
        //行为委托给FlyRocketPowered
        model.performFly();
        model.display();
    }
}
