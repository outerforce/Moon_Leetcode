package com.utilities;
import java.util.*;
/**
 * Created by somexoh on 2017/3/17.
 */
// replace all the elements with a specific one
public class fillApp {
    public static void main(String [] args){
        //fillDemo();
        //halfFill(0,3);
        replaceallDemo();
    }
    public static void fillDemo(){
        List<String> list = new ArrayList<String>();
        list.add("adcc");
        list.add("aaa");
        list.add("kkkk");
        list.add("z");
        list.add("qq");
        System.out.println(list);
        Collections.fill(list,"pp");
        System.out.println(list);
    }
    public static void halfFill(int start, int end){
        List<String> l= new ArrayList<>();
        l.add("adcc");
        l.add("aaa");
        l.add("kkkk");
        l.add("z");
        l.add("qq");
        System.out.println(l);
        Collections.fill(l.subList(start, end),"pp");
        System.out.println(l);
    }
    public static void replaceallDemo(){
        List<String> list = new ArrayList<>();
        list.add("adcc");
        list.add("aaa");
        list.add("kkkk");
        list.add("z");
        list.add("aaa");
        list.add("qq");
        System.out.println(list);
        Collections.replaceAll(list,"aaa","xyz");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
