package com.snail.headFirst.chapter8;

import java.util.Arrays;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/31 20:37
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 3),
        };
        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        Arrays.stream(ducks).forEach(item -> System.out.println(item));
    }

}
