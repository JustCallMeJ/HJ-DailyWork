package com.hejie.acm;

public class Num60 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(runningSum(nums));
    }

    public static int[] runningSum(int[] nums) {
        int arrLen = nums.length;
        int[] result = new int[arrLen];
        result[0] = nums[0];
        for (int i = 1; i < arrLen; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
