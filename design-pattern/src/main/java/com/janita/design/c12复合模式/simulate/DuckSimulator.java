package com.janita.design.c12复合模式.simulate;

import com.janita.design.c12复合模式.Goose;
import com.janita.design.c12复合模式.GooseAdapter;
import com.janita.design.c12复合模式.Quackable;
import com.janita.design.c12复合模式.duck.DuckCall;
import com.janita.design.c12复合模式.duck.MallardDuck;
import com.janita.design.c12复合模式.duck.RedHeadDuck;
import com.janita.design.c12复合模式.duck.RubberDuck;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：使用多态模拟不同鸭子的叫声
 *
 * @author zhucj
 * @since 2019-06-28 - 14:38
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

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
