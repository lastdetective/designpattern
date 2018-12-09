package com.oreilly.designpattern.observer;


/**
 * 规定观察者应该有更新自身数据的功能
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
