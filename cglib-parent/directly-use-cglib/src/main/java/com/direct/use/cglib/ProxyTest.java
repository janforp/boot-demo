package com.direct.use.cglib;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 16:36
 */
public class ProxyTest {

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy();
        UserManager um = (UserManager) proxy.getProxy(UserManager.class);
        um.function();
    }
}
