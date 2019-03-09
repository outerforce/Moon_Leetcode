package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by somexoh on 2017/3/11.
 */
public class GenericDemo4 {
    // placeholder ?
   /* public static void printcoll(ArrayList<?> al){
        Iterator<?> iter = al.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }*/
    // restrict
    //? extend E => can get E and subtype of E
    //? super E => can get E and supertype of E
    public static void printColl(ArrayList<? extends Guy> al) {
        Iterator<? extends Guy> iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getName());
        }
    }

    public static void main(String[] args) {
        /*ArrayList<String> al = new ArrayList<>();
        al.add("sda");
        al.add("dsd");
        al.add("wdkh");
        printcoll(al);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        printcoll(al2);*/
        ArrayList<Guy> al = new ArrayList<Guy>();
        al.add(new Guy("aaa"));
        al.add(new Guy("dswd"));
        al.add(new Guy("abc"));
        printColl(al);

        ArrayList<student> al2 = new ArrayList<student>();
        al2.add(new student("ea"));
        al2.add(new student("v"));
        al2.add(new student("b"));
        printColl(al2);
    }
}

class Guy {
    private String name;

    Guy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }
}

class student extends Guy {
    student(String name) {
        super(name);
    }
}
