package com.hejie.acm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 */
public class Num53 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        System.out.println(Integer.parseInt(sb.toString()) + 1);
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        System.out.println(Integer.parseInt(sb.toString()) + 1);
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
