package com.utilities;
import java.util.*;
/**
 * Created by somexoh on 2017/3/17.
 */
public class collections_to_array {
    public static void main(String [] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        //how to define the length of the array
        //x < size() =>size();    new String[x]
        //x > size() => x;
        //x= size()
        String[] arr = al.toArray(new String[al.size()]);
        System.out.println(Arrays.toString(arr));
    }


}
