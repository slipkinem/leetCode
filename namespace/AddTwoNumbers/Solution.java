package AddTwoNumbers;

import leetcode.assist.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * <p>
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * <p>
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTowNumbers(ListNode l1, ListNode l2) {
        ListNode r = null;
        while (l1 != null || l2 != null) {
            r = new ListNode(l1.val + l2.val);
        }
        return r;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode r = solution.addTowNumbers(l1, l2);

        System.out.println(r); // r should be add 7 -> 0 -> 8
    }
}
