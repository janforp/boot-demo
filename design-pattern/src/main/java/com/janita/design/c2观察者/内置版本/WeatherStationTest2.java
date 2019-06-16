package com.janita.design.c2观察者.内置版本;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 22:32
 */
public class WeatherStationTest2 {

    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();
        CurrentConditionDisplay2 currentConditionDisplay = new CurrentConditionDisplay2(weatherData);
        weatherData.setMeasurements(80F, 65F, 30.4F);
        weatherData.setMeasurements(82F, 65F, 30.4F);
        weatherData.setMeasurements(78F, 65F, 30.4F);
    }
}
