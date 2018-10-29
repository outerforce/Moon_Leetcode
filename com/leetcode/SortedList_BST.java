package leetcode;

/**
 * Created by somexoh on 2017/3/20.
 */
/*class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }*/
public class SortedList_BST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if(prev != null){
            prev.next = null;
        }else{
            head = null;
        }
        root.left = sortedListToBST(head);
        root.right= sortedListToBST(slow.next);
        return root;
    }
}
