package com.leetcode;

import java.util.*;

/**
 * Created by somexoh on 2017/3/24.
 */

public class TopKwords {
    public static List<String> WordFreqency(String[] list, int k) {
        //count the frequency for each element
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            String word = list[i];
            if (hm.containsKey(word)) {
                hm.put(word, hm.get(word) + 1);
            } else {
                hm.put(word, 1);
            }
        }

        //get the max frequency
        int max = 0;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        //initialize an array of ArrayList. index is frequency, value is list of strings
        ArrayList<String>[] arr = (ArrayList<String>[]) new ArrayList[max + 1];
        for (int i = 1; i <= max; i++) {
            arr[i] = new ArrayList<String>();
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            int count = entry.getValue();
            String number = entry.getKey();
            arr[count].add(number);
        }

        List<String> result = new ArrayList<>();

        //add most frequent numbers to result
        for (int j = max; j >= 1; j--) {
            if (arr[j].size() > 0) {
                for (String a : arr[j]) {
                    result.add(a);
                }
            }
            if (result.size() == k)
                break;
        }
        return result;
    }
    public static void main(String[] args){
        String[] list = {"abandon","abandon","abandon","abandon","buzz","fizz","fizz","fizz", "fizz", "cut","cut","cut","cut","is","is","is","is","is"};
        List<String> result = WordFreqency(list,3);
        System.out.println(result);

    }
}
