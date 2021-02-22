package com.hejie.acm;


/**
 * 给定一个关键词集合 words 和一个字符串 S，将所有 S 中出现的关键词加粗。所有在标签 <b> 和 </b> 中的字母都会加粗。
 * <p>
 * 返回的字符串需要使用尽可能少的标签，当然标签应形成有效的组合。
 * <p>
 * 例如，给定 words = ["ab", "bc"] 和 S = "aabcd"，需要返回 "a<b>abc</b>d"。注意返回 "a<b>a<b>b</b>c</b>d" 会使用更多的标签，因此是错误的。
 * 注：
 * words 长度的范围为 [0, 50]。
 * words[i] 长度的范围为 [1, 10]。
 * S 长度的范围为 [0, 500]。
 * 所有 words[i] 和 S 中的字符都为小写字母。
 */
public class Num46 {
    public static void main(String[] args) {
        String[] words = {"ccb", "b", "d", "cba", "dc"};
        String s = "eeaadadadc";
        System.out.println(s.indexOf('d'));
        // s.indexOf()
        System.out.println(boldWords(words, s));
    }

    public static String boldWords(String[] words, String S) {
        int[] indexB = new int[S.length() + 1];
        StringBuilder resutl = new StringBuilder();
        for (int i = 0; i < words.length; i++) {

            int temp = S.indexOf(words[i]);

            if (temp > -1) {
                indexB[temp] = 1;
                indexB[temp + words[i].length()] = 2;
            }

        }
        System.out.println();
        int j = 0;
        for (int i = 0; i < indexB.length; i++) {
            if ((i == 0 && indexB[i] == 1) || (i > 0 && indexB[i - 1] == 0 && indexB[i] == 1)) {
                resutl.append("<b>");

            }
            if ((i == indexB.length - 1 && indexB[i] == 2) || (i < indexB.length - 1 && indexB[i + 1] == 0 && indexB[i] == 2)) {
                resutl.append("</b>");
            }
            if (j < S.length()) {
                resutl.append(S.charAt(j));
            }
            j++;
        }
        return resutl.toString();
    }
}
