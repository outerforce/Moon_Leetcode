package com.company;

import java.util.*;

/**
 * Created by somexoh on 2017/3/15.
 */
//when to use map => data has map relation
public class getAppearString {
    public static String repeat(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> tm = new TreeMap<>();

        //Set<Map.Entry<Character,Integer>> ts = tm.entrySet();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            Integer value = tm.get(ch[i]);
            if(value!=null)
                count = value;
            count++;
            tm.put(ch[i],count);
            count = 0;
            }
           /* if (value == null) {
                tm.put(ch[i], 1);
            } else {
                value = value + 1;
                tm.put(ch[i],value);
            }*/
        //System.out.println(tm);
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character,Integer>> es = tm.entrySet();
        Iterator<Map.Entry<Character,Integer>> it = es.iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> me = it.next();
            Character c = me.getKey();
            Integer i = me.getValue();
            sb.append(c+"("+i+")");

        }
        return sb.toString();
        //return null;
    }

    public static void main(String[] args) {
        String s = repeat("ahdqqffaaa");
        System.out.println(s);
    }
}
