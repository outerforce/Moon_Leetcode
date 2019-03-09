package com.utilities;
import java.util.*;
/**
 * Created by somexoh on 3/16/2017.
 */

/*
* operation on set
* can sort the list
* */
class LenComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        if(s1.length()<s2.length())
            return -1;
        if(s1.length()>s2.length())
            return 1;
        return s1.compareTo(s2);
    }
}
public class collections{
    public static void main(String[] args){
            sortDemo();
    }

    public static void sortDemo(){
        List<String> list = new ArrayList<String>();
        list.add("adcc");
        list.add("aaa");
        list.add("z");
        list.add("qq");
        System.out.println(list);
        //Collections.sort(list,new LenComparator());
        String max = Collections.max(list,new LenComparator());
        System.out.println(max);

    }

 /*   public static <T extends Comparable<? super T>> void sort(List<T> list){

    }*/
}
