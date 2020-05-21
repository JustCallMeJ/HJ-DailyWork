package com.hejie.acm;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Num25 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int upgrade = 0;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val == 0 ? 0 : l1.val;
            }
            if (l2 != null) {
                num2 = l2.val == 0 ? 0 : l2.val;
            }
            int sum = num1 + num2 + upgrade;
            upgrade = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            if (upgrade >= 1) {
                curr.next = new ListNode(1);
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result.next;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
        }
    }
}
