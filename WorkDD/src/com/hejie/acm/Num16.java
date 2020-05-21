package com.hejie.acm;

import java.util.Arrays;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 */
public class Num16 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int arrLength = arr.length;
        int max = arr[arrLength-1];
        int[] resutl = new int[arrLength];
        resutl[arrLength - 1] = -1;
        for (int i = arrLength - 2; i >= 0; --i) {
            resutl[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return resutl;
    }
}
