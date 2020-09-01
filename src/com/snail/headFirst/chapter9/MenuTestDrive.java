package com.snail.headFirst.chapter9;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/1 9:37
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
