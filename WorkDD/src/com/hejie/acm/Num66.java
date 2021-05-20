package com.hejie.acm;

public class Num66 {
    public static int[] nums;

    public Num66(int[] nums) {
        Num66.nums = nums;
    }

    public static int sumRange(int i, int j) {
        int sum = 0;
        for (int index = i; index <= j; index++) {
            sum += nums[index];
        }
        return sum;
    }
}
