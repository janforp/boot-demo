package com.janita.design.c2观察者.内置版本;

import lombok.Getter;

import java.util.Observable;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 11:54
 */
public class WeatherData2 extends Observable {

    @Getter
    private float temperature;

    @Getter
    private float humidity;

    @Getter
    private float pressure;

    public WeatherData2() {
    }

    void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float hummidity, float pressure) {
        this.temperature = temperature;
        this.humidity = hummidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
