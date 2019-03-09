package com.utilities;

/**
 * Created by somexoh on 2017/3/17.
 */
//可变参数放在参数列表最后面
public class ParamMethodDemo {
    public static void main(String[] args){
        show(2);
        show(2,3,4,5);
    }
    //arr is an array
    //pass all the parameters in to the function and it creates an array dynamically
    public static void show(int...arr){
        System.out.println(arr.length);
    }
    /*public static void show(int[] arr){

    }*/
 /*   public static void show(int a, int b){
        System.out.println(a+","+b);
    }

    public static void show(int a , int b, int c){

    }*/
}
