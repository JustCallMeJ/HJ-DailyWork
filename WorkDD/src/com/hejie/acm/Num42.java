package com.hejie.acm;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 */
public class Num42 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));

    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                result.add(nums[start]);
                result.add(nums[end]);
                break;
            }
            if (nums[start] + nums[end] > target) {
                end--;
            }
            if (nums[start] + nums[end] < target) {
                start++;
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
