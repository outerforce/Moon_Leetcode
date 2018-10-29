package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
public class Array_BST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return buildTree(nums,0,nums.length-1);
    }
    private static TreeNode buildTree(int[] nums, int start, int end){
        if(start>end){return null;}
        int mid = (start + end )/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, start, mid-1);
        node.right = buildTree(nums, mid+1, end);
        return node;
    }
    public static void main(String [] args){

    }
}
