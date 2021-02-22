package com.hejie.acm;

public class Num58 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int count = 1;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;

    }
}
