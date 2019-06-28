package com.janita.design.c12复合模式.duckfactory;

import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;

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
        return new QuackCounter(goose::honk);
    }
}
