package com.company;

import java.util.*;

/**
 * Created by somexoh on 2017/3/14.
 */

/*
* 增加=> put()
* 删除=> clear(), remove()
* 判断=> containsValue(), containsKey(), isEmpty()
* 获取=> get(), size(), values()
*
 * ==>HashTable, no null key or value , synchronized
 * ==>HashMap, available null key and null value .non-syn
 * ==>treemap, DS=>binary tree, sort the keys in map (similar as set) set is based on map, .non-syn
*
* */

public class hashMap {

    public static void main (String [] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("01","zhang1");
        map.put("02","zhang2");
        map.put("03","zhang3");
        map.put("04","zhang4");
        System.out.println(map.containsKey("01"));
        System.out.println(map.remove("02"));
        System.out.println(map.get("03"));
        System.out.println(map.put(null,"hah"));
        //获取所有值 return
        System.out.println(map);
        // return collection
        System.out.println(map.values());
        //put new value with same key will replace the original value
         //and return the original value

        //how to iterate the hashmap => keySet since set has iterator
        Set<String> ks = map.keySet();
        Iterator<String> iter = ks.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key+":" +value);
        }
        //method entrySet, Map.Entry.   entry is an internal interface in Map interface
        Set<Map.Entry<String,String>> es = map.entrySet();
        Iterator<Map.Entry<String,String>> iter1 = es.iterator();
        while(iter1.hasNext()){
            Map.Entry<String,String> me = iter1.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"..."+value);
        }
    }
}
