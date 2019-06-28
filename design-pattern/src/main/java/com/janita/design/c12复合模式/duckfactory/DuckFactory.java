package com.janita.design.c12复合模式.duckfactory;

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
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallarDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck(){
        return new RedHeadDuck();
    }

    @Override
    public Quackable createMDuckCall(){
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck(){
        return new RedHeadDuck();
    }

}
