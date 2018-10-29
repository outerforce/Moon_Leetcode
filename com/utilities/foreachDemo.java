package com.utilities;

import java.util.*;

/**
 * Created by somexoh on 2017/3/17.
 */
//for loop
public class foreachDemo {
    public static void main(String [] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc1");
        al.add("abc2");
        //only get the data, not operate on collection
        //iterator can remove the element
        //ListIterator can ADUS
        for(String s : al){
            System.out.println(s);
        }
        System.out.println(al);
        int[] arr = {3,5,1};
        for(int i : arr){
            System.out.println(i);
        }
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        for(int i : hm.keySet()){
            System.out.println(hm.get(i));
        }
        for(Map.Entry<Integer,String> j : hm.entrySet()){
            System.out.println(j.getKey()+"..."+j.getValue());
        }

    }
}
