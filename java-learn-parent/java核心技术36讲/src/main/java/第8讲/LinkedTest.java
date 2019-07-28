package 第8讲;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-21 - 16:13
 */
public class LinkedTest {

    private static void testLinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();;
        set.add(1);
        set.add(2);
        set.spliterator().forEachRemaining(item -> {
            System.out.println(item);
        });
    }

    private static void testNavigableSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set.lower(2));
        System.out.println(set.floor(3));
        System.out.println(set.descendingSet());
        System.out.println(set.headSet(2));
        System.out.println(set.tailSet(2));



    }

    public static void main(String[] args) {
        testHashTable();
    }

    private static void testMap() {
        Map<Integer, Integer> map = new HashMap<>(2);
        map.put(1, 1);
        map.put(2, 2);
        map.replaceAll((k,v) -> k+v);
        System.out.println(map);
        System.out.println(map.putIfAbsent(3, 5));
    }

    private void testSync() {
        Collections.synchronizedList(new ArrayList<>());
    }

    private static void testHashTable() {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(1,1);
        hashtable.put(2, 2);
        System.out.println(hashtable);
    }


}
