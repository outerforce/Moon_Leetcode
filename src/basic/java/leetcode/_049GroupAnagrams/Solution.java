package basic.java.leetcode._049GroupAnagrams;

/**
 * Created by Irene on 2018-02-05.
 */

import java.util.*;

/***
 * Group Anagrams
 * Description
 Given an array of strings, group anagrams together.
 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return: [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 */

public class Solution {
    public List<List<String>> groupAnagrams(String[] array) {
        if (array == null || array.length == 0) return Collections.emptyList();

        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String str : array) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String afterSorted = String.valueOf(c);
            if (!map.containsKey(afterSorted)) {
                map.put(afterSorted, i++);
                List<String> sublist = new ArrayList<>();
                sublist.add(str);
                result.add(sublist);
            } else {
                result.get(map.get(afterSorted)).add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = s.groupAnagrams(input);
        System.out.println(res);
    }
}
