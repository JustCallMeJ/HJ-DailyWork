package com.hejie.acm;

public class Num39 {
    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(flipAndInvertImage(A));

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int col = A.length;
        int raw = A[0].length;
        int[][] result = new int[col][raw];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < raw; j++) {
                result[i][j] = A[i][raw - j - 1] == 0 ? 1 : 0;
            }
        }
        return result;
    }
}
