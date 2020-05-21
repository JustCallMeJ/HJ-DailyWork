package com.hejie.acm;


public class Num18 {
    public static void main(String[] args) {
        int[] A = {0,1,2,1,0};
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        int arrIndex = 0;
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= max) {
                max = A[i];
                arrIndex = i;
            }
        }
        return arrIndex;
    }
}
