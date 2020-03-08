package com.hejie.acm;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 */
public class Num9 {
    public static void main(String[] args) {
        String s = "abca";

        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int sLength = s.length();
        int start = 0;
        int end = sLength - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return sS(s, start+ 1, end) || sS(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean sS(String s, int i, int j) {
        while (i<j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
