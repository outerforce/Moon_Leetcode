package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/19.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%15==0){
                result.add("FizzBuzz");
            }else if(i%5==0){
                result.add("Buzz");
            }else if(i%3==0){
                result.add("Fizz");
            } else{
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<String> l = fizzBuzz(15);
        System.out.println(l);
    }
}
