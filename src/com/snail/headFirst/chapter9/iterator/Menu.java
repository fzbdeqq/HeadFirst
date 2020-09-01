package com.snail.headFirst.chapter9.iterator;

import com.snail.headFirst.chapter9.composite.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:55
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents=new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("\n"+getName()+","+getDescription()+"---------");
        Iterator iterator= menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent= (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    /**
     * 返回Iterator
     * @return
     */
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
