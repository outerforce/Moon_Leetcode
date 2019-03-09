package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
//a+b+c=0
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i< len-2; i++){
            if(i>0&&nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1, k=len-1;
            int target = -nums[i];
            while(j<k){
                if(nums[j]+nums[k] == target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k&&nums[j] == nums[j-1]) j++;
                    while(j<k&&nums[k] == nums[k+1]) k--;
                }else if(nums[j] +nums[k]>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> l = threeSum(nums);
        System.out.println(l);
    }
}

