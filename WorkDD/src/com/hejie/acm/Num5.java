package com.hejie.acm;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * <p>
 * 返回重复了 N 次的那个元素。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,3]
 * 输出：3
 */
public class Num5 {
    public static void main(String[] args) {
        int[] A = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(A));
    }

    public static int repeatedNTimes(int[] A) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int index : A) {
            result.put(index, result.getOrDefault(index, 0) + 1);
        }

        int num = 0;
        for (int indexL:result.keySet()) {
            if(result.get(indexL)>1) {
                num = indexL;
            }
        }
        return num;

    }
    /**
     * int aLength = A.length;
     *         int result = 0;
     *         int max = 0;
     *         int[] AA = new int[10000];
     *         for (int i = 0; i < aLength; i++) {
     *             AA[A[i]]++;
     *         }
     *
     *         for (int i = 0; i < AA.length; i++) {
     *             if (AA[i] > max) {
     *                 max = AA[i];
     *                 result = i;
     *
     *             }
     *         }
     *         return result;
     */
}
