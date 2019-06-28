package com.janita.design.c12复合模式;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
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

        print("\nDuck Simulator 开始模拟鸭子的叫声了，请仔细听.....\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
