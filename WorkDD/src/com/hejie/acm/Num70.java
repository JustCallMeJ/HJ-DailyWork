package com.hejie.acm;

import java.util.Stack;

public class Num70 {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public Num70() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int result = peek();
        outStack.pop();
        return result;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (outStack.empty()) {
            while (!inStack.empty()) {
                outStack.push(inStack.peek());
                inStack.pop();
            }
        }
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }
}
