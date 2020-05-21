package com.hejie.acm;

import java.util.Arrays;

public class Num21 {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        boolean results = false;
        int leftARight = 0;
        int upADown = 0;
        for (char index : moves.toCharArray()) {
            if (index == 'U') {
                upADown--;
            }
            if (index == 'D') {
                upADown++;
            }
            if (index == 'L') {
                leftARight++;
            }
            if (index == 'R') {
                leftARight--;
            }
        }
        if (0 == upADown && 0 == leftARight) {
            results = true;
        }
        return results;
    }
}
