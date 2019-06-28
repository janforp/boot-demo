package com.janita.design.c12复合模式.观察者;

import com.janita.design.c12复合模式.观察者.Observer;

/**
 * 类说明：
 * <p>
 *     可以被观察的对象，在此处就是鸭子
 * </p>
 *
 * @author zhucj
 * @since 2019-06-28 - 15:41
 */
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
