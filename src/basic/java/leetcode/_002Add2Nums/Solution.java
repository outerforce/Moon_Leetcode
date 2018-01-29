package basic.java.leetcode._002Add2Nums;

import basic.java.structure.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode m, ListNode n){
        ListNode node = new ListNode(0);
        ListNode n1 = m, n2 = n, t = node;
        int sum = 0;
        while(m != null || n != null){
            sum /= 10;
            if (n1 != null){
                sum += n1.val;
                n1 = n1.next;
            }
            if(n1 != null){
                sum += n2.val;
                n2 = n2.next;
            }
            t.next = new ListNode(sum % 10);
            t = t.next;
        }
        if (sum /10 != 0) t.next = new ListNode(1);
        return node.next;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
    }
}
