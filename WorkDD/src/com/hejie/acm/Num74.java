package com.hejie.acm;

public class Num74 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(minStartValue(nums));

    }

    public static int minStartValue(int[] nums) {
        for (int index = 1; index <= 100; index++) {
            int sum = index;
            if (!fun(sum, nums)) {
                continue;
            }
            return index;
        }
        return -1;
    }

    public static boolean fun(int sum, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum <= 0) {
                return false;
            }
        }
        return true;
    }
}
