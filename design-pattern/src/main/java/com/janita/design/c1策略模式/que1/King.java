package com.janita.design.c1策略模式.que1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 09:12
 */
public class King extends Character {

    @Override
    void fight() {
        weaponBehavior.useWeapon();
    }
}
