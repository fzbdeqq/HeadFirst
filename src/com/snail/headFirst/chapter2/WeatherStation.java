package com.snail.headFirst.chapter2;

import com.snail.headFirst.chapter2.observer.CurrentConditionsDisplay;
import com.snail.headFirst.chapter2.observer.ForecastDisplay;
import com.snail.headFirst.chapter2.observer.StatisticsDisplay;
import com.snail.headFirst.chapter2.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.setMeasurements(78f, 90f, 29.2f);
    }
}
