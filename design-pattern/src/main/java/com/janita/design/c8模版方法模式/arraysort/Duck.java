package com.janita.design.c8模版方法模式.arraysort;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 15:57
 */
@AllArgsConstructor
@EqualsAndHashCode
public class Duck implements Comparable<Duck> {

    @Getter
    private String name;

    @Getter
    private int weight;

    @Override
    public String toString() {
        return name + " weight = " + weight;
    }

    @Override
    public int compareTo(Duck other) {
        return Integer.compare(this.weight, other.weight);
    }
}
