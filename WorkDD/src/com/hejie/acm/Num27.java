package com.hejie.acm;

import java.math.BigInteger;

public class Num27 {
    public static void main(String[] args) {
        int x = 1234;
        String nums = "2222222222222222222222222222";
        System.out.println("###" + reverse(x));
        BigInteger tt = new BigInteger(nums);
        String rer = String.valueOf(tt.multiply(tt));
        System.out.println(rer);

    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (sb.charAt(0) == '-') {
            if ((Integer.MIN_VALUE) >
                    Long.valueOf("-" + sb.reverse().toString().substring(0, sb.toString().length() - 1))) {
                return 0;
            } else {
                return Integer.parseInt('-' + sb.toString().substring(0, sb.toString().length() - 1));
            }
        } else {
            if (Integer.MAX_VALUE < Long.valueOf(sb.reverse().toString())) {
                return 0;
            } else {
                return Integer.parseInt(sb.toString());
            }

        }
    }
}
