package com.snail.headFirst.chapter11.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/3 9:14
 */
public interface MyRemote extends Remote {
    public String sayHello()throws RemoteException;
}
