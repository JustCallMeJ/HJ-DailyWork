package com.hejie.acm;

import java.util.ArrayList;
import java.util.List;

public class Num54 {
    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        System.out.println(largeGroupPositions(s));

    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (end < s.length()) {
            // List<Integer> tempArr = new ArrayList<>();
            if (s.indexOf(start) == s.indexOf(end)) {
                end++;
            } else {
                start = end;
                end = start + 1;
            }
        }
        return result;
    }

}
