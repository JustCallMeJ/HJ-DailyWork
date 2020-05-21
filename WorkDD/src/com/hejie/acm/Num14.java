package com.hejie.acm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num14 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> resultList = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            resultList.add(index[i],nums[i]);
        }

        int[] results = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            results[i] = num;
            i++;
        }
        return results;
    }
}

