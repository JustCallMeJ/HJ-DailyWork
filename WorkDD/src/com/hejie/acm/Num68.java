package com.hejie.acm;

public class Num68 {

    public static int[][] matrix;

    public Num68(int[][] matrix) {
        this.matrix = matrix;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                result += matrix[i][j];
            }
        }

        return result;
    }
}
