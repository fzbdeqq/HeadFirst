package com.snail.headFirst.chapter9.iterator;

import com.snail.headFirst.chapter9.composite.MenuComponent;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 8:50
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
