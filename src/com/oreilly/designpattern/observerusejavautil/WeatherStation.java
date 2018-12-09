package com.oreilly.designpattern.observerusejavautil;

import org.junit.Test;

public class WeatherStation {

    @Test
    public void runWeatherStation2() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(25, 60, 101.1f);
        System.out.println("------现在我们把当前温度移除--------");
        weatherData.deleteObserver(currentConditionsDisplay);
        weatherData.setMeasurements(32, 71, 101.6f);

    }
}
