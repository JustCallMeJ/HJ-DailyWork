package com.hejie.acm;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意：你不能在买入股票前卖出股票。
 */
public class Num33 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    //    public static int maxProfit(int[] prices) {
//        int result = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int temp = prices[j] - prices[i];
//                if (temp > result) {
//                    result = temp;
//                }
//            }
//        }
//        return result;
//    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                result = Math.max(prices[i] - minPrice, result);
            }
        }
        return result;
    }
}
