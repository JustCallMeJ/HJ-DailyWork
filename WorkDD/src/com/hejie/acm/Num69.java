package com.hejie.acm;

public class Num69 {
    public static void main(String[] args) {
        int nums = 5;
        System.out.println(countBits(nums));
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            result[i] = doAction(i);
        }

        return result;
    }

    public static int doAction(int i) {
        int result = 0;
        while (i > 0) {
            i &= (i - 1);
            result++;
        }
        return result;
    }

}
