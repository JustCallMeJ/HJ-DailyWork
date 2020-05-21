package com.hejie.acm;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 */
public class Num37 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
        ;
    }

    public static int firstUniqChar(String s) {
        int result = -1;
        int[] arr = new int[1000];
        for (char index : s.toCharArray()) {
            arr[index]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (arr[i] == 1) {
                sb.append(Character.toChars(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().contains(String.valueOf(s.charAt(i)))) {
                return i;

            }
        }
        return result;
    }
}
