package com.janita.design.c12复合模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 类说明：用于管理一群鸭子
 *
 * @author zhucj
 * @since 2019-06-28 - 15:23
 */
public class Flock implements Quackable {

    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }
}
