package com.leet.code.arithmetic;

import lombok.experimental.UtilityClass;

import java.util.Arrays;

/**
 * 类说明：
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author janita
 * @since 2019-06-10 - 10:45
 */
@UtilityClass
public class Plalindrome {

    private static String getPlalindrome(String source) {
        if (source == null || source.length() == 0) {
            return source;
        }
        char[] chars = source.toCharArray();
        char[] reverseChars = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseChars[chars.length - 1 -i] = chars[i];
        }
        String a;
        String b;
        String longestStr = "";
        for (int i = 0; i < chars.length; i++) {
            char charI = chars[i];
            for (int j = 0; j < reverseChars.length; j++) {
                if (i + j >= chars.length) {
                    continue;
                }
                char charJ = reverseChars[j];
                if (charI == charJ) {
                    a = new String(Arrays.copyOfRange(chars, i,chars.length - j));
                    b = new String(Arrays.copyOfRange(reverseChars, j, chars.length - i));
                    if (a.equals(b)) {
                        if (a.length() > longestStr.length()) {
                            longestStr = a;
                        }
                    }
                }
            }
        }
        return longestStr;
    }
}
