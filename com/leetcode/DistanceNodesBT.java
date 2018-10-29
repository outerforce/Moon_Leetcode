package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */
public class DistanceNodesBT {
    public int findDistance(Node root, int n1, int n2){
        int x = pathLen(root,n1)-1;
        int y = pathLen(root,n2)-1;
        int lcaValue = findLCA(root,n1,n2).val;
        int lcaDistance = pathLen(root,lcaValue)-1;
        return (x+y)-2*(lcaDistance);

    }
    public int pathLen(Node root, int n){
        if(root!=null){
            int x =0;
            if((root.val==n)||(x=pathLen(root.left,n))>0||(x=pathLen(root.right,n))>0){
                return x+1;
            }
            return 0;
        }
        return 0;
    }

    public Node findLCA(Node root, int n1, int n2){
        if (root != null) {
            if(root.val == n1 || root.val == n2){
                return root;
            }
            Node left = findLCA(root.left, n1, n2);
            Node right = findLCA(root.right,n1,n2);
            if(left != null && right != null){
                return root;
            }
            if(left!=null){
                return left;
            }
            if(right!=null){
                return right;
            }
        }
        return null;

    }

    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.right.right = new Node(45);
        DistanceNodesBT i = new DistanceNodesBT();
        System.out.println("Distance between 45 and 20 is : "
                + i.findDistance(root, 30, 20));
    }

}
