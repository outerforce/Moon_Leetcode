package basic.java.leetcode._021MergeTwoSortedLists;

/**
 * Created by Irene on 2018-02-01.
 */

import basic.java.structure.ListNode;

/***
 * Merge Two Sorted Lists
 * Description
 * The new list should be made by splicing together the nodes of the first two lists.
 * Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */
public class Solution {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return head.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1 = ListNode.addNodeData("1,2,4");
        ListNode l2 = ListNode.addNodeData("1,3,4");
        ListNode res = s.mergeTwoList(l1, l2);
        ListNode.printLink(res);
    }
}
