package com.janita.design.c12复合模式;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 类说明：适配器，把一只鹅适配到鸭子接口上
 *
 * @author zhucj
 * @since 2019-06-28 - 14:44
 */
@AllArgsConstructor
@NoArgsConstructor
public class GooseAdapter implements Quackable {

    private Goose goose;

    @Override
    public void quack() {
        goose.honk();
    }
}
