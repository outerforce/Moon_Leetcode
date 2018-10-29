package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
//Definition for a binary tree node.
/*class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }*/

public class ZigZagBT {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root,result,0);
        return result;
    }
    private void traverse(TreeNode cur, List<List<Integer>> list, int level){
        if(cur == null) return;
        int i = 1;
        if(list.size()<= level){

        }
    }
}
