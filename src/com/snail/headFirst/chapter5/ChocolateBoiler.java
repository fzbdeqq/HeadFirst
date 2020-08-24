package com.snail.headFirst.chapter5;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/8/24 23:21
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }

    public ChocolateBoiler getInstance(){
        if(instance==null){
            instance=new ChocolateBoiler();
        }
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty=true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled=true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
