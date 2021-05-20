package com.hejie.acm;

import java.util.Arrays;

public class Num72 {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] tempArr = new int[gain.length + 1];
        tempArr[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            tempArr[i + 1] = tempArr[i] + gain[i];
        }
        Arrays.parallelSort(tempArr);
        return tempArr[gain.length];
    }
}
