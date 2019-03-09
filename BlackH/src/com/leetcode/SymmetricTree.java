package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */

/**
 * Definition for a binary tree node.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class SymmetricTree {
    //recursively one
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {return true;}
        return isSymmetricHelper(root.left, root.right);
    }
    private boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null && right == null){return true;}
        if((left == null && right != null) ||(left != null && right ==null))
        {return false;}
        if(left.val != right.val){return false;}
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

    //iterative one
    public boolean isSymmetric2(TreeNode root) {
        if(root == null) {return true;}
        if(root.left == null && root.right == null){return true;}
        if(root.left == null || root.right == null){return false;}
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode left = root.left;
        TreeNode right = root.right;

        s.push(left);
        s.push(right);
        while(!s.isEmpty()){
            right = s.pop();
            left = s.pop();
            if(left.val!=right.val){return false;}
            if(left.left == null && right.right != null){return false;}
            if(left.left != null && right.right == null){return false;}

            if(left.left != null && right.right != null){
                s.push(left.left);
                s.push(right.right);
            }

            if(left.right == null && right.left != null){ return false;}
            if(left.right != null && right.left == null){ return false;}

            if(left.right != null && right.left != null){
                s.push(left.right);
                s.push(right.left);
            }
        }
        return true;
    }

}