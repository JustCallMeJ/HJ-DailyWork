package com.hejie.acm;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class Num40 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));

    }

    public static int findRepeatNumber(int[] nums) {
        int[] temp = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= 2) {
                return temp[i];
            }
        }
        return 0;
    }
}
