package com.hejie.acm;

import java.util.ArrayList;
import java.util.List;

public class Num67 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 5, 6};
        int target = 11;
        System.out.println(pairSums(nums, target));
    }

    public static List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> resutl = new ArrayList<>();
        int[] tempArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && tempArr[i] == 0 && tempArr[j] == 0 && (nums[i] + nums[j] == target)) {
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                    tempArr[i] = 1;
                    tempArr[j] = 1;
                    resutl.add(t);
                }
            }
        }
        return resutl;
    }
}
