package leetcode;

/**
 * Created by somexoh on 2017/3/19.
 */
//sorted linked list, remove num that has duplicates
public class RemoveList2 {
    //recursive

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode cur = head;
        while (cur != null) {
            //find the last node of duplicates
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }

            if (slow.next == cur) {
                slow = slow.next;
            } else {
                slow.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
