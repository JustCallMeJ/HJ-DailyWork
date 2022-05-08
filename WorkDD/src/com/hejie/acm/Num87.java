package com.hejie.acm;

/**
 * 1813. 句子相似性 III
 * 一个句子是由一些单词与它们之间的单个空格组成，且句子的开头和结尾没有多余空格。比方说，"Hello World" ，"HELLO" ，"hello world hello world" 都是句子。每个单词都 只 包含大写和小写英文字母。
 * <p>
 * 如果两个句子 sentence1 和 sentence2 ，可以通过往其中一个句子插入一个任意的句子（可以是空句子）而得到另一个句子，那么我们称这两个句子是 相似的 。比方说，sentence1 = "Hello my name is Jane" 且 sentence2 = "Hello Jane" ，我们可以往 sentence2 中 "Hello" 和 "Jane" 之间插入 "my name is" 得到 sentence1 。
 * <p>
 * 给你两个句子 sentence1 和 sentence2 ，如果 sentence1 和 sentence2 是相似的，请你返回 true ，否则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：sentence1 = "My name is Haley", sentence2 = "My Haley"
 * 输出：true
 * 解释：可以往 sentence2 中 "My" 和 "Haley" 之间插入 "name is" ，得到 sentence1 。
 * 示例 2：
 * <p>
 * 输入：sentence1 = "of", sentence2 = "A lot of words"
 * 输出：false
 * 解释：没法往这两个句子中的一个句子只插入一个句子就得到另一个句子。
 * 示例 3：
 * <p>
 * 输入：sentence1 = "Eating right now", sentence2 = "Eating"
 * 输出：true
 * 解释：可以往 sentence2 的结尾插入 "right now" 得到 sentence1 。
 * 示例 4：
 * <p>
 * 输入：sentence1 = "Luky", sentence2 = "Lucccky"
 * 输出：false
 */
public class Num87 {
    public static void main(String args[]) {
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
//        相似有这么3种情况
//        左相同 "Emily loves coding" - "Emily"
//        右相同 "Emily loves coding" - "coding"
//        两端相同，中间不同 "Emily loves coding" - "Emily coding"
//        满足之一返回true。
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }

    public static boolean areSentencesSimilar(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return true;
        }
        if (s.length() < t.length()) {
            return areSentencesSimilar(t, s);
        }

        String[] A = s.split(" ");
        String[] B = t.split(" ");
        int m = A.length, n = B.length;

        // 左相同
        int i = 0;
        while (i < n && A[i].equals(B[i])) {
            i++;
        }
        if (i == n) {
            return true;
        }

        // 右相同
        int j = 0;
        while (j < n && A[m - 1 - j].equals(B[n - 1 - j])) {
            j++;
        }
        if (j == n) {
            return true;
        }

        // (i + j) == n 两端相等，中间不等
        return (i + j) == n;
    }
}
