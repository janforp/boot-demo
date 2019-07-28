package com.effective.java.learn.controller;

import com.effective.java.learn.c2创建和销毁对象.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 类说明：比较调用2个函数分别的耗时，创建对象的开销不可以忽略
 *
 * @author zhucj
 * @since 2019-07-22 - 16:21
 */
@RestController
@RequestMapping("/baby")
public class BabyBoomerController {


    @GetMapping("/baby1")
    public String baby1() {
        long start = System.currentTimeMillis();
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        for (int i = 0; i < 1000000; i++) {
            Person person = new Person(boomStart);
            System.out.println(person.isBabyBoomer());
        }
        long end = System.currentTimeMillis();
        return end - start + "";
    }

    @GetMapping("/baby2")
    public String baby2() {
        long start = System.currentTimeMillis();
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        for (int i = 0; i < 1000000; i++) {
            Person person = new Person(boomStart);
            System.out.println(person.isBabyBoomer2());
        }
        long end = System.currentTimeMillis();
        return end - start + "";
    }
}
