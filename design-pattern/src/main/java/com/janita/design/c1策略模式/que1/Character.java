package com.janita.design.c1策略模式.que1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 09:08
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    abstract void fight();
}
