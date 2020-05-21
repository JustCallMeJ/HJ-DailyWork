package com.hejie.acm;

public class Num30 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        System.out.println(reverseList(head));

    }

    public static ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode curr = result;
        while (head != null) {
            ListNode temp = curr.next;
            curr.next = result;
            result = curr;
            curr = temp;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
