package com.hejie.acm;

public class Num9 {
    public static void main(String[] args) {
        int num = 8;

        System.out.println(isPowerOfFour(num));
    }

    public static int isPowerOfFour(int num) {
        int result = num & (num - 1);
        return result;
    }
}
