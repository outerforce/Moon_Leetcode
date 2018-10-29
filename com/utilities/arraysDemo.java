package com.utilities;
import java.util.*;
/**
 * Created by somexoh on 2017/3/17.
 */

// turn arrays to list
    /*contains
    get
    indexOf
    subList
    * */
public class arraysDemo {
    public static void main(String[] args){
        /*int arr[] = {2,3,7};
        System.out.println(Arrays.toString(arr));*/
        String[] s = {"abc","cc","kkkk"};

        //bassic data type, the array as the element of collection
        int[] nums = {2,4,5};
        List<int[]> li = Arrays.asList(nums);

        Integer[] Inum = {2,5,7};
        List<Integer> l = Arrays.asList(Inum);
        //List<String> list =  Arrays.asList(s);
        System.out.println(li);
        System.out.println(l);
    }
}
