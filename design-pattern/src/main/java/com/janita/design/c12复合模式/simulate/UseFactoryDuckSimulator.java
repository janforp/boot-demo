package com.janita.design.c12复合模式.simulate;

import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.GooseAdapter;
import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.duck.DuckCall;
import com.janita.design.c12复合模式.duck.MallardDuck;
import com.janita.design.c12复合模式.duck.RedHeadDuck;
import com.janita.design.c12复合模式.duck.RubberDuck;
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
public class UseFactoryDuckSimulator {

    public static void main(String[] args) {
        UseFactoryDuckSimulator simulator = new UseFactoryDuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory factory = new CountingGooseFactory();
        simulator.simulate(duckFactory);
        simulator.simulate(factory.createGooseDuck());

        print("真正的鸭子的叫声次数 === " + QuackCounter.getQuacks());

    }

    private void simulate(AbstractDuckFactory duckFactory ) {
        Quackable mallardDuck = duckFactory.createMallarDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createMDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseAdapter = new GooseAdapter(new Goose());

        print("\nDuck Simulator 开始模拟鸭子的叫声了，请仔细听.....\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseAdapter);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
