package com.hejie.acm;

public class Num61 {
    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        int[][] matrix = {{1, 2}, {2, 2}};
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int raw = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                if (i + 1 < raw && j + 1 < col) {
                    if (matrix[i + 1][j + 1] != matrix[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
