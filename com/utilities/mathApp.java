package com.utilities;
import java.math.*;
import java.util.*;
/**
 * Created by somexoh on 2017/3/17.
 */
// ceil()=>return the minimal int that is greater than the num
// floor()=> return the maximal int that is smaller than the num
public class mathApp {
    public static void main(String [] args){
       /* double d = Math.ceil(-16.2);
        double d1 = Math.floor(-16.7);
        long l = Math.round(12.49);
        double d2 = Math.pow(2,3);
        System.out.println(d+"..."+d1+"..."+l+"..."+d2);*/
       for(int x=0; x < 10; x++){
           int d = (int)(Math.random()*100+1);
           //System.out.println(d);
       }
       Random r = new Random();
        for(int x=0; x < 10; x++){
            int a = r.nextInt(10)+1;
           // System.out.println(a);
        }

        System.out.println(bigHalf(12.312321));
    }
    public static String bigHalf(double value){
        return String.format("%.2f", value).toString();

    }

}