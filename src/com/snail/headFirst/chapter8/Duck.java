package com.snail.headFirst.chapter8;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/31 20:34
 */
public class Duck implements Comparable{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck= (Duck) o;
        if(this.weight<((Duck) o).weight){
            return -1;
        }else if(this.weight==((Duck) o).weight){
            return 0;
        }else {
            return 1;
        }
    }
}
