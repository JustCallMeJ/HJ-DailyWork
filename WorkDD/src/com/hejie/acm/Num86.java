package com.hejie.acm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 442. 数组中重复的数据
 * 给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。
 * <p>
 * 你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[2,3]
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：[1]
 * 示例 3：
 * <p>
 * 输入：nums = [1]
 * 输出：[]
 */
public class Num86 {
    public static void main(String args[]) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        List<Integer> reuslt = new ArrayList<>();
        for (int index : nums) {
            resultMap.put(index, resultMap.getOrDefault(index, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> index : resultMap.entrySet()) {
            if (index.getValue() == 2) {
                reuslt.add(index.getKey());
            }
        }


        return reuslt;
    }
}
