package com.hejie.acm;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
 * <p>
 * <p>
 * 示例：
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * <p>
 */
public class Num48 {
    private Stack<Integer> stack1 = new Stack<>();
    private PriorityQueue<Integer> min = new PriorityQueue<>();

    /**
     * initialize your data structure here.
     */
    public Num48() {

    }

    public static void main(String[] args) {
        Num48 tt = new Num48();
        tt.push(1);
        System.out.println(tt.top());
        System.out.println(tt.getMin());

    }

    public void push(int x) {
        stack1.push(x);
        min.add(x);
    }

    public void pop() {
        int temp = stack1.peek();
        min.remove(temp);
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
