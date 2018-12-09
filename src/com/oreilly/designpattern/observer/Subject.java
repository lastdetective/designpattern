package com.oreilly.designpattern.observer;


/**
 * 这个接口规定，气象站有哪些功能
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
