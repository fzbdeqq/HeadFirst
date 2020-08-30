package com.snail.headFirst.chapter7.adapter.adapter;

import com.snail.headFirst.chapter7.adapter.adapter.turkey.Turkey;

/**
 * @Author: SnailBBB
 * @Description:火鸡适配器，转换为鸭子对象
 * @Date: 2020/8/30 17:23
 */
public class TurkeyAdapter implements Duck {
    //对象适配器
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
