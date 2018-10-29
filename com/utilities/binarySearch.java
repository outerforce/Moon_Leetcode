package com.utilities;
import java.util.*;
/**
 * Created by somexoh on 2017/3/17.
 */
public class binarySearch {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("adcc");
        list.add("aaa");
        list.add("kkkk");
        list.add("z");
        list.add("qq");
        //System.out.println(list);
        //Collections.sort(list);
        Collections.sort(list,new LenComparator());
        //String max = Collections.max(list,new LenComparator());
        System.out.println(list);
        //int index = halfSearch(list,"aaaa");
        int index = halfSearch2(list,"aaa", new LenComparator());
        //int index = Collections.binarySearch(list,"aaaa");
        System.out.println(index);
    }

    public static int halfSearch(List<String> list,String key){
        int max,min,mid;
        max = list.size()-1;
        min = 0;
        while(min<max){
            mid = (min+max)>>1;//  /2
            String str = list.get(mid);
            int num = str.compareTo(key);
            if(num>0)
                max = mid -1;
            else if(num<0)
                min = mid +1;
            else return mid;
        }
        //插入点的负数 -1
        return -min-1;
    }
    public static int halfSearch2(List<String> list,String key, Comparator<String> comparator){
        int max,min,mid;
        max = list.size()-1;
        min = 0;
        while(min<max){
            mid = (min+max)>>1;//  /2
            String str = list.get(mid);
            int num = comparator.compare(str,key);
            if(num>0)
                max = mid -1;
            else if(num<0)
                min = mid +1;
            else return mid;
        }
        //插入点的负数 -1
        return -min-1;
    }
}
