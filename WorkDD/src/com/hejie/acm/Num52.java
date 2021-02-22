package com.hejie.acm;

public class Num52 {
    public static void main(String[] args) {
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            head = head.next;
        }
        while (head != null) {
            curr = curr.next;
            head = head.next;
        }
        return curr;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
