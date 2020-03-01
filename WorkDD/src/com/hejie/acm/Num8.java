package com.hejie.acm;

import java.util.Stack;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 */
public class Num8 {
    public static void main(String[] args) {
        String str = "LLLLRRRR";

        System.out.println(balancedStringSplit(str));
    }

    public static int balancedStringSplit(String s) {
        int resutl = 0;
        int count = 0;
        for (char index : s.toCharArray()) {
            if ('R' == index) {
                count++;
            } else {
                count--;
            }
            if (0 == count) {
                resutl++;
            }
        }
        return resutl;
    }
}
