package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */
class Node
{
    int val;
    Node left, right;
    public Node(int value)
    {
        val = value;
        left = right = null;
    }
}
public class LCAncestorBT {
    public Node lowestCommonAncestor(Node root, Node p, Node q){
        if(root == null) return null;
        if(root == p || root == q) return root;
        Stack<Node> pStack = new Stack<>();
        Stack<Node> qStack = new Stack<>();
        Node result = null;
        if(findPath(root,p,pStack)&&findPath(root,q,qStack)){
            while(!pStack.isEmpty()){
                Node pnode = pStack.pop();
                if(qStack.contains(pnode)){
                    result = pnode;
                }
            }
        }
        return result;

    }
        public boolean findPath(Node root,Node n, Stack<Node> s){
            if(root == null) return false;
            if(root == n){
                s.push(n);
                return true;
            }
            if(findPath(root.left,n,s)||findPath(root.right,n,s)){
                s.push(root);
                return true;
            }
            return false;

    }
    public Node lowestCommonAncestor2(Node root, Node p, Node q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null) return root;
        if(left == null && right != null) return right;
        if(left != null && right == null) return left;
        return null;
    }
}
