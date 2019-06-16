package com.janita.design.c2观察者.内置版本;

import com.janita.design.c2观察者.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 11:56
 */
public class CurrentConditionDisplay2 implements Observer, DisplayElement {

    Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在的情况：" + temperature + "F，湿度 = " + humidity + "%");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 data2 = (WeatherData2) o;
            this.temperature = data2.getTemperature();
            this.humidity = data2.getHumidity();
            display();
        }

    }
}
