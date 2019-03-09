package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
public class ArrayShuffle {
    private int[] nums;
    private Random random;
    public ArrayShuffle(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = nums.clone();
        for(int i= 1;i<a.length;i++){
            int j = random.nextInt(i+1);
            swap(a,i,j);
        }
        return a;
    }
    private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
