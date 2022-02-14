package com.hejie.acm;

import java.util.HashMap;
import java.util.Map;

/**
 * 31189. “气球” 的最大数量
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * <p>
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：text = "nlaebolko"
 * 输出：1
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：text = "leetcode"
 * 输出：0
 */
public class Num79 {
    public static void main(String args[]) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character index : text.toCharArray()) {
            charMap.put(index, charMap.getOrDefault(index, 0) + 1);
        }
        int a = charMap.getOrDefault('a', 0);
        int b = charMap.getOrDefault('b', 0);
        int n = charMap.getOrDefault('n', 0);
        int l = charMap.getOrDefault('l', 0) / 2;
        int o = charMap.getOrDefault('o', 0) / 2;
        return Math.min(Math.min(Math.min(n, l), Math.min(a, b)), o);
    }
}
