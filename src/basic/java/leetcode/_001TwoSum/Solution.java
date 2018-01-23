package basic.java.leetcode._001TwoSum;

import java.util.Arrays;

class Solution{
    public static int[] twoSum(int[] nums, int target){
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for (int j = i+1 ; j < len; j++){
                if (nums[j] == target -nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        int [] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}

