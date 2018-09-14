package basic.java.leetcode._015ThreeSum;

/**
 * Created by Irene on 2018-02-01.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 3Sum
 * Description
 Given an array S of n integers, a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.
 For example, given array S = [-1, 0, 1, 2, -1, -4],
 A solution set is: [[-1, 0, 1],[-1, -1, 2]]
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length - 2) {
            if (nums[0] > 0) break;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i++], nums[left++], nums[right--]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                } else if (sum < 0) left++;
                else right--;
            }
            while (nums[i] == nums[++i] && i < nums.length - 2) ;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = s.threeSum(arr);

        System.out.println(list);

    }
}
