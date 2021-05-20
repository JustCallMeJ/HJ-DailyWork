package com.hejie.acm;

public class Num75 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalMoney(n));

    }

    public static int totalMoney(int n) {
        int result = 0;

        int zheng = n / 7;
        int yu = n % 7;

        result = (7 * zheng + 49) / 2;

        result = result + (zheng + zheng + yu) * (yu - 1) / 2;

        return result;
    }
}
