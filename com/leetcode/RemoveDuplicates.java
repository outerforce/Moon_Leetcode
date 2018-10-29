package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */
//sorted array, space O(1)
public class RemoveDuplicates {
    public static int remove(int[] nums){
        if(nums.length ==0) return 0;
        int j = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public static int remove1(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return hs.size();
    }

    public static int remove2(int[] nums){
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }


    public static void main(String[] args){
        int[] arr ={3};
        int a = remove(arr);
        int a1 = remove1(arr);
        int a2 = remove2(arr);
        System.out.println(a+"..."+a1+"..."+a2);
    }
}
