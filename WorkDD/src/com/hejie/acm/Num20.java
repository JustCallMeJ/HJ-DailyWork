package com.hejie.acm;

import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 * 输入：heights = [1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 当前数组：[1,1,4,2,1,3]
 * 目标数组：[1,1,1,2,3,4]
 * 在下标 2 处（从 0 开始计数）出现 4 vs 1 ，所以我们必须移动这名学生。
 * 在下标 4 处（从 0 开始计数）出现 1 vs 3 ，所以我们必须移动这名学生。
 * 在下标 5 处（从 0 开始计数）出现 3 vs 4 ，所以我们必须移动这名学生。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Num20 {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        for (int i = 0;i<heights.length;i++) {
            temp[i] = heights[i];
        }
        Arrays.parallelSort(temp);
        int results = 0;
        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != temp[i]) {
                results++;
            }
        }
        return results;
    }
}
