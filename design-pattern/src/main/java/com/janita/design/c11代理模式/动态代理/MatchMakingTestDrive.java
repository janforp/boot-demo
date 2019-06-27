package com.janita.design.c11代理模式.动态代理;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-27 - 23:18
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        // initializeDatabase();
    }

    private void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe");

        PersonBean ownerProxy = OwnerInvocationHandler.getOwnerProxy(joe);

        print("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("Insterests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(100);
        }catch (Exception e) {
            print("Can't set rating form owner proxy");
        }
        print("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean notOwnerProxy = NotOwnerInvocationHandler.getOwnerProxy(joe);
        print("Name is " + notOwnerProxy.getName());
        try {
            ownerProxy.setInterests("bowling , Go");
        }catch (Exception e) {
            print("Can't set rating form owner proxy");
        }
        notOwnerProxy.setHotOrNotRating(200);
        print("Rating set from non owner proxy");
        print("Rating is " + notOwnerProxy.getHotOrNotRating());
    }
}
