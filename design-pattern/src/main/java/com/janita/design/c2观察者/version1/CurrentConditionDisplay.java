package com.janita.design.c2观察者.version1;

import com.janita.design.c2观察者.DisplayElement;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 11:56
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("现在的情况：" + temperature + "F，湿度 = " + humidity + "%");
    }
}
