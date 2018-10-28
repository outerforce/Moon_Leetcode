package basic.java.leetcode._001TwoSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Irene on 2018-01-29.
 */

/***
 * Two Sum
 * Description
 Given nums = [2, 7, 11, 15], target = 9,
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 ***/

//Tags: Array, Hash Table

class Solution {

    //brute force   time: n^2 space: 1
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //hashtable     time: O(n) space: n
    public static int[] twoSum1(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    /**
     * store: (7,0),(2,1),(-2,2),(-6,3)
     * [2,7,11,15]
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = {7, 3, 6, 3, 11, 15};
        int target = 6;
        int[] result = twoSum(arr, target);
        int[] result1 = twoSum1(arr, target);
        System.out.println("0: " + Arrays.toString(result));
        System.out.println("1: " + Arrays.toString(result1));
    }
}

