package com.janita.design.c2观察者.version1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 22:32
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80F, 65F, 30.4F);
        weatherData.setMeasurements(82F, 65F, 30.4F);
        weatherData.setMeasurements(78F, 65F, 30.4F);
    }
}
