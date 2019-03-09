package com.company;

/**
 * Created by somexoh on 2017/3/11.
 */
interface Inter<T>{
    void show(T t);
}
/*class InterImpl implements Inter<String>{
    public void show(String t){
        System.out.println("show"+t);
    }
}*/
class InterImpl<T> implements Inter<T>{
    public void show(T t){
        System.out.println("show"+t);
    }
}
public class GenericDemo3 {
    public static void main(String[] args){
        InterImpl i = new InterImpl();
        i.show("hh");
    }
}
