package com.snail.headFirst.chapter9;

import java.util.Iterator;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 8:58
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEM=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems=new MenuItem[MAX_ITEM];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day,with a side of potato salad",
                false,
                2.79);
        addItem("Hotdog",
                "A hot dog,with saurkraut,relish,onions,topped with cheese",
                false,
                3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        if(numberOfItems>=MAX_ITEM){
            System.out.println("Sorry,menu is full! Can't add item to menu");
        }else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
