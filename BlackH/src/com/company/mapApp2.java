package com.company;

import java.util.*;
/**
 * Created by somexoh on 3/16/2017.
 */
/*
    "actor" "Student("01","amber")"
    "actor" "Student("02","ben")"
    "director" "Student("03","carol")"
    "director" "Student("02","deniel")"
*/
class Student1{
    private String id;
    private String name;
    Student1(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id+":"+name;

    }
}
public class mapApp2{
    public static void main(String [] args){
        HashMap<String, List<Student1>> hm = new HashMap<String,List<Student1>>();
        List<Student1> actor = new ArrayList<Student1>();
        List<Student1> director = new ArrayList<Student1>();
        actor.add(new Student1("01", "amber"));
        actor.add(new Student1("02", "ben"));

        director.add(new Student1("05", "cal"));
        director.add(new Student1("06", "daniel"));

        hm.put("actor", actor);
        hm.put("director", director);

        Iterator<String> iter = hm.keySet().iterator();
        while(iter.hasNext()){
            String id = iter.next();
            System.out.println(id);
            List<Student1> l = hm.get(id);
            getinfo(l);

        }

    }
    public static void getinfo(List<Student1> l){
        Iterator<Student1> iter = l.iterator();
        while(iter.hasNext()){
            Student1 s = iter.next();
            System.out.println(s);
        }
    }

}