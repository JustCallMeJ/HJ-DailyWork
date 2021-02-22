package com.hejie.acm;

/**
 * 简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * 示例 1：
 * <p>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 */
public class Num41 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(s.replace(' ', '#'));
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.trim().split(" ");
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (!sArr[i].isEmpty()) {
                sb.append(sArr[i]);
                if (i != 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
