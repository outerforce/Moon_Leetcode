package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
public class findDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }else{
                result.add(Math.abs(index+1));
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {3,3,4,5,6,7,7,9};
        List<Integer> l = findDuplicates(arr);
        System.out.println(l);
    }
}
