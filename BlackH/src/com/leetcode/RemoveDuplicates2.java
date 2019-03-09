package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        Set<Integer> key = hm.keySet();
        int value = 1;
        for(int i=0; i<nums.length;i++){
            if(!key.contains(nums[i])){
                hm.put(nums[i],1);
            }else{
                value++;
                hm.replace(nums[i],value);
            }
        }
        for(Integer i: key){
            if(hm.get(i)>2){
                hm.replace(i,2);
            }
        }
        System.out.println(hm.values());
        int res = 0;
        for(Integer x : hm.values()){
            res += x;
        }
        return res;
     }
    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;

    }
    public static void main(String[] args){
        int[] arr ={1,1,1,2};
        //int a = removeDuplicates(arr);
        int a1 = removeDuplicates2(arr);
//        int a1 = remove1(arr);
//        int a2 = remove2(arr);
        System.out.println(a1);
                //+"..."+a1+"..."+a2);
    }
}
