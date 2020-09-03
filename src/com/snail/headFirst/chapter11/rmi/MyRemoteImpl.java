package com.snail.headFirst.chapter11.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/3 9:14
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Server says,'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service=new MyRemoteImpl();
            LocateRegistry.createRegistry(9898);
            Naming.rebind("//127.0.0.1:9898/RemoteHello",service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
