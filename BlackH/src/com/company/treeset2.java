package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by somexoh on 2017/3/11.
 */
class Teacher {
    private String name;
    private int tid;

    Teacher(String name, int tid) {
        this.name = name;
        this.tid = tid;
    }
    public String getName(){
        return name;
    }
    public int getTid(){
        return tid;
    }
    public int compareTo(Object obj) {
        if (!(obj instanceof Teacher))
            throw new RuntimeException("not teacher");
        Teacher t = (Teacher) obj;
        if (this.tid > t.tid)
            return 1;
        if (this.tid == t.tid){
            return this.name.compareTo(t.name);//same object
        }
        return -1;
    }

}
class compare implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Teacher t1 = (Teacher) obj1;
        Teacher t2 = (Teacher) obj2;
        int num = t1.getName().compareTo(t2.getName());
        if (num == 0) {
            return new Integer(t2.getTid()).compareTo(new Integer(t2.getTid()));
        }
        return num;
    }
}
class StrLenComparator implements Comparator{
    public int compare(Object o1,Object o2){
        String s1 = (String) o1;
        String s2 = (String) o2;
        int num = new Integer(s1.length()).compareTo(s2.length());
        if(num == 0)
            return s1.compareTo(s2);
        return num;
    }
}

public class treeset2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new compare());
        TreeSet ts2 = new TreeSet(new StrLenComparator());
        ts2.add("abcd");
        ts2.add("cc");
        ts2.add("cba");
        ts2.add("efe");
        ts2.add("abfg");


        ts.add(new Teacher("aber", 3));
        ts.add(new Teacher("ben", 1));
        ts.add(new Teacher("carol", 2));
        ts.add(new Teacher("carol", 6));
        ts.add(new Teacher("densy", 4));
        ts.add(new Teacher("camaon", 2));

       /* Iterator iter = ts.iterator();
        while (iter.hasNext()) {
            Student s = (Student) iter.next();
            System.out.println(s.getName() + "..." + s.getSid());
        }*/
        Iterator iter2 = ts2.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}

