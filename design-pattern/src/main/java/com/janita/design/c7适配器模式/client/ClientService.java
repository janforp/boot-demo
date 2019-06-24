package com.janita.design.c7适配器模式.client;

import com.janita.design.c7适配器模式.target.Duck;

/**
 * 类说明：这是客户
 *
 * @author zhucj
 * @since 2019-06-24 - 15:44
 */
public class ClientService {

    /**
     * 这是客户的接口，他只支持 duck 接口的入参数
     *
     * <p>
     * 客户只认duck,适配器只要实现了duck接口即可
     * </p>
     */
    public static void testDuck(Duck duck /* Target interface */) {
        duck.quack();
        duck.fly();
    }
}
