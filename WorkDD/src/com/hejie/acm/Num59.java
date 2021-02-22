package com.hejie.acm;

public class Num59 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        System.out.println(matrixReshape(nums, r, c));
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] result = new int[r][c];
        int[] tempArr = new int[r * c];

        int temp1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                tempArr[temp1] = nums[i][j];
                temp1++;
            }
        }


        int temp2 = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = tempArr[temp2];
                temp2++;
            }
        }

        return result;
    }
}