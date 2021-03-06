package com.snail.headFirst.chapter7.adapter.adapter;

import com.snail.headFirst.chapter7.adapter.adapter.turkey.DuckAdapter;
import com.snail.headFirst.chapter7.adapter.adapter.turkey.Turkey;
import com.snail.headFirst.chapter7.adapter.adapter.turkey.WildTurkey;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/30 17:26
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();

        Turkey turkey=new WildTurkey();

        Duck turkeyAdapter=new TurkeyAdapter(turkey);

        System.out.println("The Turkey says....");
        testTurkey(turkey);

        System.out.println("\nThe Duck says....");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter say....");

        testDuck(turkeyAdapter);

        turkey=new DuckAdapter(duck);
        System.out.println("\nThe DuckAdapter says....");
        testTurkey(turkey);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
