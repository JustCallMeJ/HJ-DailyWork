package com.hejie.acm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：num = 14
 * 输出：6
 * 解释：
 * 步骤 1) 14 是偶数，除以 2 得到 7 。
 * 步骤 2） 7 是奇数，减 1 得到 6 。
 * 步骤 3） 6 是偶数，除以 2 得到 3 。
 * 步骤 4） 3 是奇数，减 1 得到 2 。
 * 步骤 5） 2 是偶数，除以 2 得到 1 。
 * 步骤 6） 1 是奇数，减 1 得到 0 。
 *
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/solution/he-xin-qi-ou-pan-duan-he-zi-jian-you-hua-die-dai-d/
 */
public class Num7 {
    public static void main(String[] args) {
        int nums = 14;
        System.out.println(numberOfSteps(nums));
    }

    public static int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            result++;
        }
        return result;
    }
}
