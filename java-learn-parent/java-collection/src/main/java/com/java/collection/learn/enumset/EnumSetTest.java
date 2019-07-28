package com.java.collection.learn.enumset;

import com.google.common.collect.Lists;

import java.util.EnumSet;
import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-15 - 21:58
 */
public class EnumSetTest {

    public static void main(String[] args) {

        EnumSet<ImportPayrollChannelEnum> enums = EnumSet.noneOf(ImportPayrollChannelEnum.class);
        enums.add(ImportPayrollChannelEnum.SUBSTITUDE);
        enums.add(ImportPayrollChannelEnum.SUPPLY_PAYROLL);
        System.out.println(enums.contains(ImportPayrollChannelEnum.SUBSTITUDE));


        EnumSet<ImportPayrollChannelEnum> allEnum = EnumSet.allOf(ImportPayrollChannelEnum.class);
        System.out.println(allEnum.contains(ImportPayrollChannelEnum.SUBSTITUDE));

        EnumSet<ImportPayrollChannelEnum> ofEnum = EnumSet.of(ImportPayrollChannelEnum.SUBSTITUDE, ImportPayrollChannelEnum.SUPPLY_PAYROLL);
        System.out.println(ofEnum.contains(ImportPayrollChannelEnum.NORMAL));

        List<ImportPayrollChannelEnum> enumList =
            Lists.newArrayList(ImportPayrollChannelEnum.NORMAL, ImportPayrollChannelEnum.SUPPLY_PAYROLL);

        EnumSet<ImportPayrollChannelEnum> copyOfEnum = EnumSet.copyOf(enumList);
        System.out.println(copyOfEnum.contains(ImportPayrollChannelEnum.NORMAL));

    }
}
