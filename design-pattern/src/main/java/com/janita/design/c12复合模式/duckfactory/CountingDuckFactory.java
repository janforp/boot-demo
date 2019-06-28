package com.janita.design.c12复合模式.duckfactory;

import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.duck.DuckCall;
import com.janita.design.c12复合模式.duck.MallardDuck;
import com.janita.design.c12复合模式.duck.RedHeadDuck;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 15:02
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck(){
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createMDuckCall(){
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck(){
        return new QuackCounter(new RedHeadDuck());
    }

}
