package com.hejie.acm;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Num1 {
    public static void main(String[] args) {
        String case1 = "{}[]";
        if (isValid(case1)) {
            System.out.println("可以");
        } else {
            System.out.println("不可以");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> strStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (strStack.empty()) {
                strStack.push(s.charAt(i));
            } else {
                if (strStack.peek() == '{' && s.charAt(i) == '}') {
                    strStack.pop();
                    continue;
                }

                if (strStack.peek() == '(' && s.charAt(i) == ')') {
                    strStack.pop();
                    continue;
                }

                if (strStack.peek() == '[' && s.charAt(i) == ']') {
                    strStack.pop();
                    continue;
                }
                strStack.push(s.charAt(i));
            }
        }

        if (strStack.empty()) {
            return true;
        }
        return false;
    }
}
