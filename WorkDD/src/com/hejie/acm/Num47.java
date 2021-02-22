package com.hejie.acm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 */
public class Num47 {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(maxSlidingWindow(nums, k));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k <= 1) {
            return nums;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int[] temp = Arrays.copyOfRange(nums, i, k + i);
            Arrays.parallelSort(temp);
            result.add(temp[k - 1]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
