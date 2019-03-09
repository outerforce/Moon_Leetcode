package com.company;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by somexoh on 2017/3/10.
 */
class Student implements Comparable {
    private String name;
    private int sid;

    Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Student))
            throw new RuntimeException("not student");
        Student s = (Student) obj;
        if (this.sid > s.sid)
            return 1;
        if (this.sid == s.sid){
           return this.name.compareTo(s.name);//same object
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getSid() {
        return sid;
    }

}

/*
    *TreeSet =>compulsive natural sorting, so need comparable characteristics
            =>binarytree comparability  1.comparability for element, overwrite compareTo()
                                        2.comparability for set, initialize the set, comparater => compare()
    *compareTo() return 0=> same elements
*/
public class treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
    /*    ts.add("a1");
        ts.add("abcd");
        ts.add("abb");
        ts.add("Dbc");*/
        ts.add(new Student("aber", 3));
        ts.add(new Student("ben", 1));
        ts.add(new Student("carol", 2));
        ts.add(new Student("densy", 4));
        ts.add(new Student("camaon", 2));
        ts.add(new Student("ben", 1));

        Iterator iter = ts.iterator();
        while (iter.hasNext()) {
            Student s = (Student) iter.next();
            System.out.println(s.getName() + "..." + s.getSid());
        }


    }
}
