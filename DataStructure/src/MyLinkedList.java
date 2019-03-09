import java.util.List;

/**
 * @author created by Ying
 * Date: 2018-10-30
 */
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}
public class MyLinkedList {
    private static ListNode head;
    private static int size;

    public MyLinkedList() {
    }

    public void addFirst(int firstValue) {
        ListNode tmp = head;
        head = new ListNode(firstValue);
        head.next = tmp;
        size++;
    }

    public void addLast(int lastValue) {
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new ListNode(lastValue);
        size++;
    }

    public void add(int index, int value) {
        ListNode tmp = head;
        ListNode pointer;
        for (int i = 0; i < index - 1 && tmp.next != null; i++) {
            tmp = tmp.next;
        }
        pointer = tmp.next;
        tmp.next = new ListNode(value);
        tmp.next.next = pointer;
        size++;
    }

    public void remove(int index) {
        ListNode tmp = head;
        //ListNode pointer;
        for (int i = 0; i < index - 1 && tmp.next != null; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        size--;
    }

    public void removeLast(){
        ListNode tmp = head;
        //ListNode pointer;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = null;
        size--;
    }

    public int indexOf(ListNode target){
        ListNode tmp = head;
        int index = 0;
        while(tmp.val != target.val){
            index++;
            tmp = tmp.next;
        }
        return index;
    }
    public int getValue(int index) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            if (count == index) {
                break;
            }
            cur = cur.next;
            count++;
        }
        // cur == null || count == index
        return cur == null ? -1 : cur.val;
    }

    public ListNode get(int index){
        ListNode tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp;
    }

    public int getSize(){
        return size;
    }

    public void print(ListNode head){
        ListNode tmp = head;
        while(tmp != null){
            System.out.printf("-> %d", tmp.val);
            tmp = tmp.next;
        }
    }

    /* Function to reverse the linked list */
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    /**
     * recursive reverse
     */
    public ListNode reverseUtil(ListNode cur, ListNode pre){
        if(cur.next == null){
            head = cur;
            cur.next = pre;
            return head;
        }
        ListNode pointer = cur.next;
        cur.next = pre;
        reverseUtil(pointer,cur);
        return head;
    }

    public ListNode reverseBetween(ListNode head, int m, int n){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode lhead = null;
        ListNode cur = dummy;
        for(int i = 0; i < m; i++){
            lhead = cur;
            cur = cur.next;
        }
        ListNode pre = null;
        ListNode next  = null;
        for(int j = m; j <= n; j++){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode subhead = pre;
        while(pre.next != null){
            pre = pre.next;
        }
        pre.next = cur;
        lhead.next = subhead;
        return dummy.next;
    }

    public static void main(String[] args){
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(0);
        ll.addLast(12);
        ll.addLast(18);
        //ll.print(head);
        //System.out.printf("size: % d",ll.getSize());
        System.out.println();
        ll.add(4,9);
        ll.add(4,9);
        //System.out.printf("size: % d",ll.getSize());
        System.out.println();
        //ll.print();
        ll.remove(4);
        //ll.print(head);
        //head = ll.reverse(ll.get(0));
        //ll.print(head);
        //System.out.println(ll.getSize());
        ListNode res = ll.reverseUtil(head, null);
        ll.print(head);
        System.out.println();
        ll.reverseBetween(head, 2,4);
        ll.print(head);
//        ll.addFirst(1);
//        ll.add(1,2);
//        System.out.println(ll.getValue(1));
//        System.out.println(ll.getValue(0));
//        System.out.println(ll.getValue(2));
        //System.out.println(ll.getValue(6));
    }

}
