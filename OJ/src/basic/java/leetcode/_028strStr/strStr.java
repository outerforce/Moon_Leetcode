package basic.java.leetcode._028strStr;

/**
 * @author created by Ying
 * Date: 2018-09-24
 */

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1: Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
// complexity: O(m+n)
public class strStr {
    public static int strStr(String haystack, String needle) {
        if (haystack == " " || needle == " ") {
            return 0;
        }
        int i, j;
        for (i = 0; i < haystack.length() - needle.length(); i++) {
            for(j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }//for j
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "baa"));
    }

}
