package com.oreilly.designpattern.observer;


/**
 * 实时气温显示屏
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData weatherData;

    /**
     * 每次生成一个显示屏，就向气象站注册
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在的天气是: " + temperature + " ℃，相对湿度是： " + humidity + "%，大气压是：" + pressure + "kPa");
    }


    /**
     * 更新显示屏显示的数据
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
