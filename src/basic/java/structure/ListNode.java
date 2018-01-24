package basic.java.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }

    public static ListNode addNodeData(String data){
        if(data.equals("[]")) return null;
        data = data.substring(1,data.length()-1);
        String [] arr = data.split(",");
        int len = arr.length;
        ListNode[] nodes = new ListNode[len+1];
        nodes[0] = new ListNode(Integer.valueOf(arr[0]));
        for(int i = 1; i< len; i++){
            nodes[i] = new ListNode(Integer.valueOf(arr[i]));
            nodes[i-1].next = nodes[i];
        }
        return nodes[0];
    }
}
