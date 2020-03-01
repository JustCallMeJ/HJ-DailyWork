package com.hejie.acm;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class Num2 {

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int raw = grid.length;
        int col = grid[0].length;
        int[][] result = new int[raw][col];
        result[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int j = 1; j < raw; j++) {
            result[j][0] = result[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < raw; i++) {
            for (int j = 1; j < col; j++) {
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[raw-1][col-1];
    }
}

/**
 * 暴力递归
 * public static void main(String[] args) {
 * int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
 * System.out.println(minPathSum(grid));
 * }
 * <p>
 * public static int minPathSum(int[][] grid) {
 * return minPathSum1(grid,grid.length-1 , grid[0].length-1);
 * }
 * <p>
 * public static int minPathSum1(int[][] grid, int raw, int col) {
 * if (raw == -1 || col == -1) {
 * return Integer.MAX_VALUE;
 * }
 * if (0 == raw && 0 == col) {
 * return grid[raw][col];
 * }
 * <p>
 * return Math.min(minPathSum1(grid, raw - 1, col), minPathSum1(grid, raw, col - 1)) + grid[raw][col];
 * }
 */
