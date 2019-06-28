package com.janita.design.c12复合模式.simulate;

import com.janita.design.c12复合模式.Flock;
import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.GooseAdapter;
import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.duckfactory.AbstractDuckFactory;
import com.janita.design.c12复合模式.duckfactory.AbstractGooseFactory;
import com.janita.design.c12复合模式.duckfactory.CountingDuckFactory;
import com.janita.design.c12复合模式.duckfactory.CountingGooseFactory;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：在一群既有鸭子又有鹅的动物中，统计出鸭子的叫声次数
 * <p>装饰者模式</p>
 *
 * @author zhucj
 * @since 2019-06-28 - 14:38
 */
public class UseFactoryAndCompositeDuckSimulator {

    public static void main(String[] args) {
        UseFactoryAndCompositeDuckSimulator simulator = new UseFactoryAndCompositeDuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    private void simulate(AbstractDuckFactory duckFactory ) {
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createMDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        print("\nDuck Simulator 开始模拟鸭子的叫声了，请仔细听.....这次是有管理一群鸭子的功能的\n");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(duckFactory.createMallarDuck());
        flockOfMallards.add(duckFactory.createMallarDuck());
        flockOfMallards.add(duckFactory.createMallarDuck());
        flockOfMallards.add(duckFactory.createMallarDuck());

        flockOfDucks.add(flockOfMallards);

        print("\nDuck模拟器：所有鸭子群");
        simulate(flockOfDucks);

        print("/n野鸭群在叫了");
        simulate(flockOfMallards);

        print("真正的鸭子的叫声次数 === " + QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
