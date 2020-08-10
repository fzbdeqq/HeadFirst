package com.snail.headFirst.chapter2.subject;

import com.snail.headFirst.chapter2.observer.Observer;

/**
 * 主题
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
