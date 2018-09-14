package basic.java.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }

    /*
    @param data x,x,x
    @return {ListNode}
     */
    public static ListNode addNodeData(String data){
        if(data.equals("")) return null;
        String [] arr = data.split(",");
        int len = arr.length;
        ListNode[] nodes = new ListNode[len];
        nodes[0] = new ListNode(Integer.valueOf(arr[0]));
        for(int i = 1; i< len; i++){
            nodes[i] = new ListNode(Integer.valueOf(arr[i]));
            nodes[i-1].next = nodes[i];
        }
        return nodes[0];
    }

    public static void printLink(ListNode listnode){
        if(listnode == null){
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder(String.valueOf(listnode.val));
        ListNode p = listnode.next;
        while(p!= null){
            str.append(",").append(String.valueOf(p.val));
            p = p.next;
        }
        System.out.println(str);
    }
}
