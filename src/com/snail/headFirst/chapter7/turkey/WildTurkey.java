package com.snail.headFirst.chapter7.turkey;

/**
 * @Author: SnailBBB
 * @Description: 野鸡
 * @Date: 2020/8/30 17:20
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
