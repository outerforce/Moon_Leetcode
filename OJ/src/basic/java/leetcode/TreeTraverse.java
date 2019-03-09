package basic.java.leetcode;

import basic.java.structure.TreeNode;

import java.util.*;

/**
 * @author created by Ying
 * Date: 2018-10-28
 */
public class TreeTraverse {
    public List<TreeNode> BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            /* poll() removes the present head.*/
            TreeNode tempNode = queue.poll();
            list.add(tempNode);
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        } return list;
    }

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

    public static int findMax(TreeNode node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.val;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
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
        while (!stack.empty()) {

            // Pop the top item from stack and print it
            //TreeNode top = stack.peek();
            cur = stack.pop();
            res.add(cur.val);

            // Push right and left children of the popped node to stack
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return res;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        if (root == null) return res;
        stack.push(cur);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();
            /* go down the tree in search of a leaf an if so process it
            and pop stack otherwise move down */
            if (pre == null || pre.left == current || pre.right == current) {
                if (current.left != null)
                    stack.push(current.left);
                else if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    res.add(current.val);
                }

                /* go up the tree from left node, if the child is right
                   push it onto stack otherwise process parent and pop
                   stack */
            } else if (current.left == pre) {
                if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    res.add(current.val);
                }

                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
            } else if (current.right == pre) {
                stack.pop();
                res.add(current.val);
            }

            pre = current;
        }

        return res;
    }

}
