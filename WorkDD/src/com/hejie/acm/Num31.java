package com.hejie.acm;

public class Num31 {
    public static void main(String[] args) {
        int x = 131;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        StringBuilder temp = new StringBuilder(String.valueOf(x));
        String tem1 = temp.toString();
        if (tem1.equals(temp.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
