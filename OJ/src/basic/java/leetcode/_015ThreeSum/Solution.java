package basic.java.leetcode._015ThreeSum;

/**
 * Created by Irene on 2018-02-01.
 */

import java.util.*;

/***
 * 3Sum
 * Description
 Given an array S of n integers, a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.
 For example, given array S = [-1, 0, 1, 2, -1, -4], -> [-4,-1,-1,0,1,2]
 A solution set is: [[-1, 0, 1],[-1, -1, 2]]
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len < 3){ return res;}
        int i = 0;
        while (i < nums.length - 2) {
            if (nums[0] > 0) break;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) left++;
                else right--;
            }
            while (nums[i] == nums[++i] && i < nums.length - 2) ;//skip the same number
        }
        return res;
    }


    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len < 3){ return res;}
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[0] > 0){return res;}
            if(i > 0 && nums[i] == nums[i-1]){continue;}
            int l = i + 1, r = nums.length - 1;
            int target = -nums[i];
            while(l < r){
                if(nums[l] + nums[r] == target){
                    res.add(Arrays.asList(nums[i],nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                } else if(nums[l] + nums[r] > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr1 = {-2,0,1,1,2};
        int[] arr2 = {};
        List<List<Integer>> list2 = s.threeSum(arr);
        List<List<Integer>> list= s.threeSum(arr1);

        System.out.println(list);
        System.out.println(list2);

    }
}
//
//    public List<List<Integer>> threeSum1(int[] nums) {
//        Arrays.sort(nums);
//        int len = nums.length;
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i = 0; i < len- 2; i++){
//            for(int j = i + 1; j < len - 1; j++){
//                for(int k = j + 1; k < len; k++){
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                        List<Integer> target = new ArrayList<>();
//                        target.add(nums[i]);
//                        target.add(nums[j]);
//                        target.add(nums[k]);
//                        result.add(target);
//                    }
//                }
//            }
//        }return result;
//    }