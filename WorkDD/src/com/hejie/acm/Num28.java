package com.hejie.acm;

public class Num28 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));

    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int result = 0;
        int i = 3;
        while (i <= n) {
            result = first + second;
            first = second;
            second = result;
            i++;
        }
        return result;
    }
}
