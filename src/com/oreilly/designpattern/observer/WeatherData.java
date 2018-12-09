package com.oreilly.designpattern.observer;

import java.util.ArrayList;


/**
 * 定义这个气象站
 */
public class WeatherData implements Subject {
    /**
     * 注册的观察者列表
     */
    private ArrayList<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {

        this.observers = new ArrayList<>();

    }
    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }


    /**
     * 提醒观察者
     */
    @Override
    public void notifyObservers() {
        if (observers != null && observers.size() > 0) {
            observers.stream().forEach(o -> o.update(temperature, humidity, pressure));
        }

    }

    /**
     * 调用提醒方法
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 气象站设置新的数据，并通知观察者（显示屏）
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
