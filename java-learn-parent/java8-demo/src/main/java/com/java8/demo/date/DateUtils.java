package com.java8.demo.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 类说明：
 *
 * <p>
 * Instant         时间戳
 * Duration        持续时间、时间差
 * LocalDate       只包含日期，比如：2018-09-24
 * LocalTime       只包含时间，比如：10:32:10
 * LocalDateTime   包含日期和时间，比如：2018-09-24 10:32:10
 * Period          时间段
 * ZoneOffset      时区偏移量，比如：+8:00
 * ZonedDateTime   带时区的日期时间
 * Clock           时钟，可用于获取当前时间戳
 * java.time.format.DateTimeFormatter      时间格式化类
 * </p>
 * @author zhucj
 * @since 2019-08-04 - 01:01
 */
public class DateUtils {

    public static void testFormat() {
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format);

        Instant instant = Instant.now();
        String s = instant.toString();
        System.out.println(s);
    }

    public static void main(String[] args) {
        // testFormat();
        test2();
    }

    public static void test2() {

        // 解析日期
        String dateText = "20180924";
        LocalDate date = LocalDate.parse(dateText, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("格式化之后的日期=" + date);

        // 格式化日期
        dateText = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("dateText=" + dateText);

    }
}
