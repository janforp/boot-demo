package com.janita.design.c2观察者.version1;

/**
 * 类说明：因为主题才是拥数据的人，观察者是主题的依赖者
 *
 * @author zhucj
 * @since 2019-06-16 - 10:47
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
