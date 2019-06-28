package com.janita.design.c12复合模式.duck;


import com.janita.design.c12复合模式.观察者.Observable;
import com.janita.design.c12复合模式.观察者.Observer;
import com.janita.design.c12复合模式.Quackable;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 14:36
 */
public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        print("RubberDuck（橡皮鸭） === Squeak（吱吱）");
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
