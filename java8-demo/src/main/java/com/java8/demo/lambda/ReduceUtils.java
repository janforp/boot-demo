package com.java8.demo.lambda;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/13 - 上午9:51
 */
public class ReduceUtils {

    private static List<Integer> integerList = Lists.newArrayList();

    private static List<BigDecimal> decimalList = Lists.newArrayList();

    static {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        decimalList.add(new BigDecimal("1.1"));
        decimalList.add(new BigDecimal("1.3"));
        decimalList.add(new BigDecimal("1"));
        decimalList.add(new BigDecimal("1"));
        decimalList.add(new BigDecimal("1"));
    }

    private static Integer reduce(List<Integer> list) {
        Integer defaultValue = 0;
        return list.stream().reduce((i1, i2) -> i1 + i2).orElse(defaultValue);
    }

    private static BigDecimal reduceBigDecimal(List<BigDecimal> list) {
        BigDecimal defaultValue = new BigDecimal(0);
        return list.stream().reduce(BigDecimal::add).orElse(defaultValue);
    }

    public static void main(String[] args) {
        Integer reduce = reduce(integerList);
        System.out.println("****" + reduce);

        BigDecimal bigDecimal = reduceBigDecimal(decimalList);
        System.out.println("****" + bigDecimal);
    }
}
