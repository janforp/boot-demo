package com.janita.design.c12复合模式.simulate;

import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.GooseAdapter;
import com.janita.design.c12复合模式.QuackCounter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.duck.DuckCall;
import com.janita.design.c12复合模式.duck.MallardDuck;
import com.janita.design.c12复合模式.duck.RedHeadDuck;
import com.janita.design.c12复合模式.duck.RubberDuck;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：在一群既有鸭子又有鹅的动物中，统计出鸭子的叫声次数
 * <p>装饰者模式</p>
 *
 * @author zhucj
 * @since 2019-06-28 - 14:38
 */
public class WithCounterDuckSimulator {

    public static void main(String[] args) {
        WithCounterDuckSimulator simulator = new WithCounterDuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable gooseAdapter = new GooseAdapter(new Goose());

        print("\nDuck Simulator 开始模拟鸭子的叫声了，请仔细听.....\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseAdapter);

        print("真正的鸭子的叫声次数 === " + QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
