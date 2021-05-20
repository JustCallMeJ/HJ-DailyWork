package com.hejie.acm;

import java.util.Arrays;

public class Num63 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums.length - 1;
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    result = i;
                    break;
                }
            }
        }
        return nums[result];
    }
}
