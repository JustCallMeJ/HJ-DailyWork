package com.hejie.acm;

/**
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * <p>
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,1],[2,3],[3,2]]
 * 输出：true
 */
public class Num6 {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        System.out.println(isBoomerang(points));
    }

    public static boolean isBoomerang(int[][] points) {
        double x = (points[0][1] - points[1][1]) * (points[1][0] - points[2][0]);
        double y = (points[1][1] - points[2][1]) * (points[0][0] - points[1][0]) ;
        if (String.valueOf(x).equals(String.valueOf(y))) {
            return false;
        } else {
            return true;
        }
    }
}
