package com.hejie.acm;

import java.util.Arrays;

public class Num64 {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] A) {
        int[] B = new int[A.length];
        System.arraycopy(A, 0, B, 0, A.length);
        Arrays.sort(B);
        boolean flag1 = true;
        boolean flag2 = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                flag1 = false;
                break;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[A.length - i - 1]) {
                flag2 = false;
                break;
            }
        }
        return !flag1 && flag2 || !flag2 && flag1 || flag1;
    }
}
