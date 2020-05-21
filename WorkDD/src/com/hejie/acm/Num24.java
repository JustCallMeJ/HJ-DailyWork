package com.hejie.acm;

import java.util.Arrays;
import java.util.HashMap;

public class Num24 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> tt = new HashMap<>();
        HashMap<String, String> d1 = new HashMap<>();
        d1.put("dd1", "ddd1");
        d1.put("dd2", "ddd2");
        tt.put("dd1", d1);

        System.out.println(tt.get("dd1").get("dd2"));


    }

    static class S {
        public static int price = 0;
        public static int dis = 0;
    }

    public static String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        int[] arr = new int[1000];
        int[] arr2 = new int[1000];
        for (char index : s.toCharArray()) {
            arr[Integer.valueOf(index)]++;
            arr2[Integer.valueOf(index)]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {

            }
            for (int j = 0; j < arr[i]; j++) {
                result.append(Character.toChars(i));
            }
        }
        Arrays.parallelSort(arr2);
        System.out.println(arr[Integer.valueOf('t')]);
        System.out.println(Character.toChars(45));
        return result.toString();
    }
}
