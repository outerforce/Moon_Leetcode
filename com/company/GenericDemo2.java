package com.company;

/**
 * Created by somexoh on 2017/3/11.
 */
//generic in class
//class Demo<T> {
class Demo {
    /* public void show(T t) {
         System.out.println("show:" + t);
     }

     public void print(T t) {
         System.out.println("print:" + t);
     }*/
    //generic in method
    public <T> void show(T t) {
        System.out.println("show:" + t);
    }

    public <Q> void print(Q q) {
        System.out.println("print:" + q);
    }
    public static<M> void method(M m){
        System.out.println("print:" + m);

    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        /*Demo<Integer> d = new Demo<>();
        d.show(new Integer("4"));
        d.print(9);

        Demo<String> d1 = new Demo<>();
        d1.show("hsajh");*/
        Demo d = new Demo();
        d.show("hh");
        d.show(4);
        d.method("jjj");

    }
}

//note: static method cannot visit the generic in class