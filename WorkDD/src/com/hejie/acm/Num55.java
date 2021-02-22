package com.hejie.acm;

public class Num55 {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(coordinates));

    }

    public static boolean checkStraightLine(int[][] coordinates) {
        boolean restult = false;
        int col = coordinates.length;
        int tempx = coordinates[0][0];
        int tempxNum = 0;
        for (int[] coordinate : coordinates) {
            if (coordinate[0] == tempx) {
                tempxNum++;
            }
        }
        if (tempxNum == col) {
            return true;
        }
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];
        double a = (y2 - y1) / (x2 - x1);
        double b = coordinates[0][1] - a * coordinates[0][0];

        int allNum = 0;
        for (int[] coordinate : coordinates) {
            if (coordinate[1] == a * coordinate[0] + b) {
                allNum++;
            }
        }
        if (allNum == col) {
            return true;
        }
        return restult;
    }
}
