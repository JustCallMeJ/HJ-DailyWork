package com.hejie.acm;

import java.util.Arrays;

/**
 * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：6
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：24
 * 示例 3：
 * <p>
 * 输入：nums = [-1,-2,-3]
 * 输出：-6
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-three-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Num56 {
    public static void main(String[] args) {
        int[] nums = {-100, -98, -1, 2, 3, 4};
        System.out.println(maximumProduct(nums));

    }

    public static int maximumProduct(int[] nums) {
        int result = 0;
        int len = nums.length;
        Arrays.parallelSort(nums);
        result = Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
        return result;
    }
}
