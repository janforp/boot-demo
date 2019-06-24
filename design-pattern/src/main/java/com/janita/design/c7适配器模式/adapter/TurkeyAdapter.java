package com.janita.design.c7适配器模式.adapter;

import com.janita.design.c7适配器模式.target.Duck;
import com.janita.design.c7适配器模式.adaptee.Turkey;

/**
 * 类说明：适配器
 * <p>
 * 现在客户的接口是支持duck。但是供应商没有duck，只有turkey。所以使用一个转接头 而这个就是转接头
 * </p>
 * <p>
 * 适配器：将一个接口，转换成客户期望的另一个接口，适配器让原本不兼容的类型可以合作无间
 * </p>
 * <p>
 * 让客户从实现接口中解耦，让适配器封装变化的部分
 * </p>
 *
 * @author zhucj
 * @since 2019-06-24 - 15:27
 */
public class TurkeyAdapter implements Duck {

    /**
     * adaptee 适配者接口，也就是目前拥有的接口
     */
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        //客户以为听到的是鸭子的声音，但是其实是火鸡发出的
        turkey.gobble();
    }

    @Override
    public void fly() {
        //客户以为看到鸭子非，但是其实是火鸡在飞
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
