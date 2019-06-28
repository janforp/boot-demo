package com.janita.design.c12复合模式.观察者;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 16:08
 */
public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();

    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(duck);
        }
    }
}
