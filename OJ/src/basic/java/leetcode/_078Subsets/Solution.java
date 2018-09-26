package basic.java.leetcode._078Subsets;

/**
 * Created by Irene on 2018-02-05.
 */

import basic.java.structure.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/***
 * Subsets
 * Description
 *  Given a set of distinct integers, nums, return all possible subsets (the power set).

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */

public class Solution {
    public List<List<Integer>> sublist(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num:nums){
           int size = result.size();
           for(int i = 0; i < size; i++){
               List<Integer> temp = new ArrayList<>(result.get(i));
               temp.add(num);
               result.add(temp);
           }
        }
        return result;
    }

//    //recursive
//    public ArrayList<ArrayList<Integer>> subset(int[] nums){
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(new ArrayList<>());
//    }
    public static void main(String[]args){
        Solution s=new Solution();
        int [] nums = {4,5,8};
        List<List<Integer>> res = s.sublist(nums);
        System.out.println(res);
    }
}
