package com.snail.headFirst.chapter5;

/**
 * @Author fuzhibin
 * @Date 2020/8/25 10:23
 * @Version 1.0
 */
public class SingletonDriver {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.getObj());
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1.getObj());
    }
}
