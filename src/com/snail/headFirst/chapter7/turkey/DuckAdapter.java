package com.snail.headFirst.chapter7.turkey;

import com.snail.headFirst.chapter7.adapter.Duck;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 17:47
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck=duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
