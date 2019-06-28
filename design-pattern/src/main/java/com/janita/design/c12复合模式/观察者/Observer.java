package com.janita.design.c12复合模式.观察者;

/**
 * 类说明：观察者接口，实现他就可以观察任何一个鸭子
 *
 * @author zhucj
 * @since 2019-06-28 - 15:44
 */
public interface Observer {

    void update(QuackObservable duck);
}
