package basic.java.leetcode._035SearchInsertPosition;

/**
 * @author created by Ying
 * Date: 2018-09-25
 */

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int position = 0;
        for(int i = 0; i < len; i++) {
            if(target > nums[i]) {
                position++;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,10};
        System.out.println(searchInsert(nums, 1));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));
    }
}
