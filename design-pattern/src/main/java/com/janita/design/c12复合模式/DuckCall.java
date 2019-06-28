package com.janita.design.c12复合模式;


import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 14:36
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        print("DuckCall === Kwak");
    }
}
