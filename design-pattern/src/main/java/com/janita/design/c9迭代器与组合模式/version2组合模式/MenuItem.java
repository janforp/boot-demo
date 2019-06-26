package com.janita.design.c9迭代器与组合模式.version2组合模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类说明：菜单项 --- 叶子节点（leaf）
 *
 * @author zhucj
 * @since 2019-06-25 - 20:57
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class MenuItem extends MenuComponent {

    String name;

    String description;

    boolean vegetarian;

    double price;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("  " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println(" , " + getPrice());
        System.out.println(" --- " + getDescription());
    }
}
