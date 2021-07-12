package com.hejie.acm;

import java.util.Arrays;

public class Num76 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(CheckPermutation(s1, s2));
    }

    public static boolean CheckPermutation(String s1, String s2) {
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s11[i] != s22[i]) {
                return false;
            }
        }
        return true;
    }
}
 