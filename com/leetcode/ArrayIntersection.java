package leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */
//O(n)
public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int i = 0; i< nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int j = 0; j<nums2.length;j++){
            if(hs.contains(nums2[j])){
                result.add(nums2[j]);
            }
        }
        int[] res = new int[result.size()];
        int i = 0;
        for(Integer num  : result){
            res[i++] = num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] a1 ={3,5,6,7,2,2,6};
        int[] a2 ={3,5,1,1};
        int[] arr = intersection(a1,a2);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
}
