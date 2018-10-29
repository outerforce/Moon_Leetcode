package basic.java.leetcode;

import basic.java.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author created by Ying
 * Date: 2018-10-28
 */
public class TreeTraverse {
    public List<Integer> inOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return res;
        TreeNode cur = root;

        while(cur != null || !stack.empty()){
            while(cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

    public List<Integer> preOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        /* recursive version
        if(root != null){
            System.out.printf("tree value is %d", root.val);
            res.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }*/
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;
        return res;
    }

    public List<Integer> postOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while(cur != null || !stack.empty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
