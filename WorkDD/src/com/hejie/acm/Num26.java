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
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 */
public class Num26 {
    public static void main(String[] args) {
        String s = "{{}}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> sStack = new Stack<>();
        sStack.push('#');
        for (char index : s.toCharArray()) {
            if (index == '{' || index == '(' || index == '[') {
                sStack.push(index);
                continue;
            }
            if (('}' == index && '{' == sStack.peek()) ||
                    (']' == index && '[' == sStack.peek()) ||
                    (')' == index && '(' == sStack.peek())) {
                sStack.pop();
            } else {
                sStack.push(index);
            }
        }
        return sStack.peek() == '#' ? true : false;
    }
}
