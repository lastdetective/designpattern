package com.oreilly.designpattern.observerusejavautil;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气预报显示屏
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    @Override
    public void display() {
        System.out.println("明天的天气是: " + temperature +
                " ℃，相对湿度是： " + humidity + "%，大气压是：" + pressure + "kPa");
    }


    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            humidity = weatherData.getHumidity();
            temperature = weatherData.getTemperature();
            pressure = weatherData.getPressure();
            display();
        }

    }
}
