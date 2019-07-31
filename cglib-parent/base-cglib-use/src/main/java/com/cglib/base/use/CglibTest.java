package com.cglib.base.use;

import org.springframework.cglib.proxy.Enhancer;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 15:27
 */
public class CglibTest {

    public static void main(String... args) {
        DaoProxy daoProxy = new DaoProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);
        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }

}