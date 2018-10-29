package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/21.
 */
public class traverseIntree {
    private List<TreeNode> inOrder(TreeNode node){
        List<TreeNode> list = new ArrayList<>();
        if(node.left != null){
            list.addAll(inOrder(node.left));
        }
        list.add(node);
        if(node.right != null){
            list.addAll(inOrder(node.right));
        }
        return list;
    }
    public List<TreeNode> BFS(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        List<TreeNode> list = new ArrayList<>();
        if(root != null){
            q.offer(root);
        }
        while(!q.isEmpty()){
            list.add(q.peek());
            TreeNode p = q.poll();
            if(p.left!=null){
                q.offer(p.left);
            }
            if(p.right!=null){
                q.offer(p.right);
            }
        }return list;
    }
    Map<String, Integer> hm = new HashMap<String,Integer>();
    Iterator<String> iter = hm.keySet().iterator();
    public static void main(String []args){
        System.out.println("hello world");
    }
}
