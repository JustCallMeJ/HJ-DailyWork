package com.hejie.acm;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入：
 * s = "abcd"
 * t = "abcde"
 */
public class Num45 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
        System.out.println();
    }

    public static char findTheDifference(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.parallelSort(arrS);
        Arrays.parallelSort(arrT);
        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] != arrT[i]) {
                return arrT[i];
            }
        }
        return arrT[arrT.length - 1];
    }
}
