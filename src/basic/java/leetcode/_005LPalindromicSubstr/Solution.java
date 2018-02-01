package basic.java.leetcode._005LPalindromicSubstr;

/**
 * Created by Irene on 2018-01-30.
 */

/***
 * Longest Palindromic Substring
 * Description
 * Given a string s, find the longest palindromic substring in s.
 You may assume that the maximum length of s is 1000.
 Example: "babad" => "bab" or "aba"
 "cbbd" => "bb"
 */
public class Solution {
    int start, end;

    // time: n^2
    public String LongestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return s;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            helper(chars, i, i);
            helper(chars, i, i + 1);
        }
        return s.substring(start, end);
    }

    private void helper(char[] chars, int l, int r) {
        while (l >= 0 && r <= chars.length - 1 && chars[l] == chars[r]) {
            l--;
            r++;
        }
        if (end - start < r - l - 2) {
            start = l + 1;
            end = r;
        }
    }

    //dynamic programming
    // i == j dp[i][j] = true
    // i + 1 == j dp[i][j] = s[i] == s[j] ?
    // i + 1 < j  dp[i][j] = dp[i + 1][j - 1] && s[i] == s[j] ?


    public String LongestPalindrome1(String s){
        int len = s.length();
        if(len <= 1) return s;
        int start = 0, end = 0;
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[len][len];
       s = "";
       return s;

    }

    // Manacher's algorithm time: n
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "babad";
        String input1 = "cbbd";
        String res = s.LongestPalindrome(input1);
        System.out.println(res);
    }
}

