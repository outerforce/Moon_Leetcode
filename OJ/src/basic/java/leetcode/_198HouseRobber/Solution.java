package basic.java.leetcode._198HouseRobber;


class Solution {
    public static int rob(int[] nums) {
        int size = nums.length;
        int pre = nums[0];
        if (size == 0) return 0;
        if (size == 1) return pre;
        int current = Math.max(pre, nums[1]);
        for (int i = 2; i < size; ++i) {
            int tmp = current;
            current = Math.max(pre + nums[i], current);
            pre = tmp;
        }
        return current;

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int result = rob(nums);
        System.out.println(result);
    }

}
