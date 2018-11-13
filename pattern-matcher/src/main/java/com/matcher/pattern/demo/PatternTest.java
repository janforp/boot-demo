package com.matcher.pattern.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/13 - 上午11:04
 */
public class PatternTest {

    private static final int maxLength = 60;

    /**
     * 工资表名字正则
     * TODO
     */
    private static final Pattern PAYROLLNAME_PATTERN = Pattern.compile("^(.+)\\((\\d+)\\)$");

    /**
     * 根据已有的工资表名字生成PayrollNameParseResult
     *
     * @param payrollName 工资表名字
     * @return PayrollNameParseResult
     */
    protected static PayrollNameParseResult payrollNameParse(String payrollName) {
        Matcher matcher = PAYROLLNAME_PATTERN.matcher(payrollName);
        PayrollNameParseResult result = new PayrollNameParseResult();
        boolean matches = matcher.matches();
        if (matches && 2 == matcher.groupCount()) {
            String name = matcher.group(1);
            String no = matcher.group(2);
            result.setName(name);
            result.setNo(Integer.valueOf(no));
        } else {
            result.setName(payrollName);
            result.setNo(0);
        }
        return result;
    }

    public static void main(String[] args) {
        String name  ="工资表(1)";
        PayrollNameParseResult payrollNameParseResult = payrollNameParse(name);
        System.out.println("*****" + payrollNameParseResult);

        PayrollNameParseResult payrollNameParseResult1 = payrollNameParse("");
        System.out.println("*****" + payrollNameParseResult1);

    }

    protected static class PayrollNameParseResult {

        /**
         * 名称
         */
        private String name;

        /**
         * 序号
         * 如：工资表(1)
         */
        private int no;

        /**
         * 名称是否超长
         *
         * @return 名称是否超长
         */
        public boolean isNameLengthExceed() {
            if (no > 0) {
                return (name.length() + String.valueOf(no).length() + 2) > maxLength;
            }
            return name.length() > maxLength;
        }

        /**
         * 截断名字
         */
        public void truncateName() {
            if (no > 0) {
                int nameMaxLength = maxLength - 2 - String.valueOf(no).length();
                name = name.substring(0, nameMaxLength);
            } else {
                name = name.substring(0, maxLength);
            }
        }

        /**
         * 展示名字
         *
         * @return 展示名字
         */
        public String getDisplayName() {
            if (no > 0) {
                return name + "(" + no + ")";
            }
            return name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }
    }
}
