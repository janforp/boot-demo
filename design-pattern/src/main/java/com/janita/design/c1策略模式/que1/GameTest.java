package com.janita.design.c1策略模式.que1;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-16 - 09:13
 */
public class GameTest {

    public static void main(String[] args) {
        Character character = new King();
        character.setWeaponBehavior(new KnifeWeapon());
        character.fight();
    }
}
