package com.oreilly.designpattern.observerusejavautil;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前气温显示屏
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;


    // 构建一个显示屏时，向气象站注册
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("今天的天气是: " + temperature + " ℃，相对湿度是： " + humidity + "%，大气压是：" + pressure + "kPa");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }
}
