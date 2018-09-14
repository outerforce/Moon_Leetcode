package basic.java.leetcode._003LSubstrNonRepeat;

/**
 * Created by Irene on 2018-01-29.
 */

import java.util.HashSet;

/***
 * Longest Substring without repeated characters
 * Description
 Given a string, find the length of the longest substring without repeating characters.
 Examples:
 Given "abcabcbb", the answer is "abc", which the length is 3.
 Given "pwwkew", the answer is "wke", with the length of 3.
 */

public class Solution {
    public int longestSubStr(String s) {
        int length = s.length();
        if (s == null || length == 0) return 0;

        HashSet<Character> set = new HashSet<>();

        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, i - start + 1);
            } else {
                for (int j = start; j < i; j++) {
                    set.remove(s.charAt(j));

                    if (s.charAt(j) == c) {
                        start = j + 1;
                        break;
                    }
                }
                set.add(c);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "addedtfgrr";
        int x = s.longestSubStr(str);
        System.out.println(x);

    }
}
