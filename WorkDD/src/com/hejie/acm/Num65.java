package com.hejie.acm;

public class Num65 {
    public static void main(String[] args) {
        String S = "xywrrmp";
        String T = "xywrrmu#p";
        System.out.println(backspaceCompare(S, T));
//        StringBuilder tt = new StringBuilder(S);
//        String s = tt.delete(S.length() - 1, S.length()).toString();
//        System.out.println(s);
    }

    public static boolean backspaceCompare(String S, String T) {
        StringBuilder tempS = new StringBuilder();
        StringBuilder tempT = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                tempS.append(S.charAt(i));
            } else {
                if (tempS.length() != 0) {
                    tempS.delete(tempS.length() - 1, tempS.length());
                }
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                tempT.append(T.charAt(i));
            } else {
                if (tempT.length() != 0) {
                    tempT.delete(tempT.length() - 1, tempT.length());
                }
            }
        }

        return tempS.toString().equals(tempT.toString());
    }
}
