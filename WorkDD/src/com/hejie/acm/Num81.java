package com.hejie.acm;

import java.util.Arrays;

/**
 * 1979. 找出数组的最大公约数
 * 给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
 * <p>
 * 两个数的 最大公约数 是能够被两个数整除的最大正整数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,5,6,9,10]
 * 输出：2
 * 解释：
 * nums 中最小的数是 2
 * nums 中最大的数是 10
 * 2 和 10 的最大公约数是 2
 * 示例 2：
 * <p>
 * 输入：nums = [7,5,6,8,3]
 * 输出：1
 * 解释：
 * nums 中最小的数是 3
 * nums 中最大的数是 8
 * 3 和 8 的最大公约数是 1
 * 示例 3：
 * <p>
 * 输入：nums = [3,3]
 * 输出：3
 * 解释：
 * nums 中最小的数是 3
 * nums 中最大的数是 3
 * 3 和 3 的最大公约数是 3
 */
public class Num81 {
    public static void main(String args[]) {
        int[] nums = {7, 5, 6, 8, 3};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int result = 0;

        Arrays.sort(nums);


        return gcd(nums[0], nums[nums.length - 1]);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
