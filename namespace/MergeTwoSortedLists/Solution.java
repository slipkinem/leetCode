package MergeTwoSortedLists;

import leetcode.assist.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * 分析
 *  l1和l2为链表，假设 l1 = {2, 4, 5}, l2 = {1, 2, 6} 应返回 {1, 2, 4, 5, 6}  注意，只合并，不排序
 *    1. 取出链表的每个值
 *      * 如果l1的值大于l2的值，将l2赋值给变量
 *      * 反制赋值l1
 *      * 将l1和l2都next，同时将assist进行next前行
 * Created by slipkinem on 8/25/2017 at 4:21 PM.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0); // 声明这个的原因是引用类型只有内部改变了，值才会改变
        ListNode assist = listNode; // 引用类型
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                assist.next = l2;
                l2 = l2.next;
            } else {
                assist.next = l1; // 这一块listNode会改变，listNode会加上next
                l1 = l1.next;
            }
            assist = assist.next; // 和listNode建立引用
        }

        // 如果l1,l2中有null才会跳出循环，在这里将剩下的拿到
        if (l1 != null) {
            assist.next = l1;
        }

        if (l2 != null) {
            assist.next = l2;
        }

        return listNode.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(4);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(6);
        System.out.println(solution.mergeTwoLists(listNode, listNode1));
    }
}
