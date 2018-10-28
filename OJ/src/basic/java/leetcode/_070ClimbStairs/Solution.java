package basic.java.leetcode._070ClimbStairs;

/**
 * @author created by Ying
 * Date: 2018-10-24
 */

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Input: 3 4   1122 1212 1221 2112 2211 2121
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step 1111, 121 211 112,22||11111 122 221 212 1121 1211 1112 2111|| 111111 11112 1122 222
 * 2. 1 step + 2 steps                111
 * 3. 2 steps + 1 step
 * 1,2,3,5,8,13
 */
class Solution {
    public static int climbStairs(int n) {
        if(n < 0) return 0;
        if(n == 1 || n == 2) {
            return n;
        }
        int a = 1, b = 2;
        for(int i = 3; i < n; i++){
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return a + b;
    }
    public int climbStairs1(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            int temp = dp[1];
            dp[1] = dp[1] + dp[0];
            dp[0] = temp;
        }
        return dp[1];
    }
    public static void main(String[] args){
        System.out.println(climbStairs(6));
    }
}
