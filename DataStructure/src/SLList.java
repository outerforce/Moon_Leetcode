/**
 * @author created by Ying
 * Date: 2018-08-31
 */

// no need for recursion and no method in IntNode by create new SSList.
//sentinel node to make sure no null pointer exception, generalization for the empty node
// save size as int => caching
//DLList to make add and remove faster

public class SLList {
    private IntNode sentinel;
    private int size;

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public SLList() {
        sentinel = new IntNode(-5, null);
        size = 0;
    }

    public SLList(int i) {
        sentinel = new IntNode(-5, null);
        sentinel.next = new IntNode(i, null);
        size = 1;
    }

    //add x to the front of the list
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

/*    public void addLast(int x) {
        size++;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }*/

    /**
     * faster method to add last node
     */
    public void addLast(int x) {

    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList sl = new SLList(15);
        sl.addFirst(10);
        sl.addFirst(5);
        System.out.println(sl.size());
    }
}
