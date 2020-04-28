package basic.java.leetcode._023MergeKSortedLists;

/**
 * Created by Irene on 2018-02-01.
 */

import basic.java.structure.ListNode;

/***
 * Merge k Sorted Lists
 * Description
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
// Tags: Linked List, Divide and Conquer, Heap

//k = number of lists, N = number of elements, time: O(Nlogk)
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return helper(lists, 0, lists.length - 1);
    }

    private ListNode helper(ListNode[] lists, int left, int right) {
        if (left >= right) {
            return lists[left];
        }
        int mid = left + right >>> 1;
        ListNode l0 = helper(lists, left, mid);
        ListNode l1 = helper(lists, mid + 1, right);
        return mergeTwoLists(l0, l1);
    }

    private ListNode mergeTwoLists(ListNode l0, ListNode l1) {
        ListNode l = new ListNode(0), temp = l;
        while (l0 != null && l1 != null) {
            if (l0.val < l1.val) {
                temp.next = new ListNode(l0.val);
                l0 = l0.next;
            } else {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            temp = temp.next;
        }
        temp.next = l0 != null ? l0 : l1;
        return l.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode[] lists = {ListNode.addNodeData("1,2,7"),
                ListNode.addNodeData("3,4,8"),
                ListNode.addNodeData("5,8,9")};
        ListNode l = s.mergeKLists(lists);
        ListNode.printLink(l);
    }
}
