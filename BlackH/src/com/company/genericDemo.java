package com.company;

import java.util.*;

/**
 * Created by somexoh on 2017/3/11.
 */
/*
    generics 泛型 一个安全机制 assure the types of the elements
    1. more safe
    2. no need for coerce cast
    3. <> to store the reference data type, E is element
*/
public class genericDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new LenComparator());
        ts.add("abc01");
        ts.add("abc0991");
        ts.add("4");
        ts.add("abc014");
        Iterator<String> iter = ts.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }


        Utils<Worker> u = new Utils<Worker>();
        u.setObject(new Worker());
        Worker w = u.getObject();
        /*ArrayList<String> al = new ArrayList<String>();
        al.add("abc01");
        al.add("abc0991");
        al.add("4");
        al.add("abc014");
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println("s..." + s.length());
        }*/
    }
}
class LenComparator implements Comparator<String>{
    public int compare(String o1, String o2){
        int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
        if(num == 0){
            return o1.compareTo(o2);
        }
        return num;
    }
}
//generic class => reference data type not specific, use generic to extension
class Utils <QQ>{
    private QQ q;
    public void setObject(QQ q){
        this.q = q;
    }
    public QQ getObject(){
        return q;
    }
}
class Worker{

}