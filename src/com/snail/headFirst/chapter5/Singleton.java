package com.snail.headFirst.chapter5;

/**
 * @Author: SnailBBB
 * @Description:单利
 * @Date: 2020/8/24 23:16
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }

        }
        return uniqueInstance;
    }
}
