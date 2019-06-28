package com.janita.design.c12复合模式;

import com.janita.design.c12复合模式.观察者.QuackObservable;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 14:35
 */
public interface Quackable extends QuackObservable {

    void quack();
}
