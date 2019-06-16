package com.janita.design.c2观察者.version1;

import java.util.ArrayList;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 11:54
 */
public class WeatherData implements Subject {

    private ArrayList observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float hummidity, float pressure) {
        this.temperature = temperature;
        this.humidity = hummidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
