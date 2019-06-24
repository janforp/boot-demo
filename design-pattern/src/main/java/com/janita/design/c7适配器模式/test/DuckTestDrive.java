package com.janita.design.c7适配器模式.test;

import com.janita.design.c7适配器模式.target.Duck;
import com.janita.design.c7适配器模式.target.MallardDuck;
import com.janita.design.c7适配器模式.adapter.TurkeyAdapter;
import com.janita.design.c7适配器模式.adaptee.WildTurkey;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import static com.janita.design.c7适配器模式.client.ClientService.testDuck;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-24 - 15:31
 */
public class DuckTestDrive {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();


        //调用目前有的接口

        System.out.println("\nThe duck says ...");
        testDuck(duck);


        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(adapter);

        Vector<Duck> vector = new Vector<>();
        Enumeration<Duck> elements = vector.elements();

        List<Duck> list = new ArrayList<>();
        Iterator<Duck> iterator = list.iterator();

    }
}
