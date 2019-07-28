package com.boot.demo.auto.config;

import org.springframework.context.annotation.Conditional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/9/30 - 下午3:44
 */
public class ComparatorImpl implements Comparator<Installer> {

    @Override
    public int compare(Installer o1, Installer o2) {
        return o2.getOsVersion().compareTo(o1.getOsVersion());
    }


    public static void main(String[] args) {

        List<Installer> list = new ArrayList<Installer>();
        Installer a1 = new Installer();
        a1.setOsVersion("V2.0.008");
        list.add(a1);

        Installer a2 = new Installer();
        a2.setOsVersion("V2.0.006");
        list.add(a2);

        Installer a3 = new Installer();
        a3.setOsVersion("V2.0.007");
        list.add(a3);

        list.sort(new ComparatorImpl());

        System.out.println(list);
    }
}

class Installer {

    private String osVersion;

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public String toString() {
        return "Installer{" +
                "osVersion='" + osVersion + '\'' +
                '}';
    }
}