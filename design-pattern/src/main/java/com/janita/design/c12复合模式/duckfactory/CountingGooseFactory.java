package com.janita.design.c12复合模式.duckfactory;

import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.观察者.Observer;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 15:02
 */
public class CountingGooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGooseDuck() {
        Goose goose = new Goose();
        return new QuackCounter(new Quackable() {
            @Override
            public void quack() {
                goose.honk();
            }

            @Override
            public void registerObserver(Observer observer) {

            }

            @Override
            public void notifyObservers() {

            }
        });
    }
}
