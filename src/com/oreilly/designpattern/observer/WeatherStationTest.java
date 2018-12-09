package com.oreilly.designpattern.observer;

import org.junit.Test;

public class WeatherStationTest {

    @Test
    public void runWeatherStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(25, 60, 101.3f);
        System.out.println("我现在只想看天气预报-----------");
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(26, 55, 101.4f);

    }
}
