package com.company;
import java.util.*;
/**
 * Created by somexoh on 2017/3/10.
 */
class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;

    }

}
public class removeduplicate {

    public static ArrayList singleElm(ArrayList al){
        ArrayList a2 = new ArrayList();
        Iterator iter = al.iterator();
        while(iter.hasNext()){
            Object obj = iter.next();
            if(!a2.contains(obj)){
                a2.add(obj);
            }
        }
        return a2;

    }
//list use equals() to compare whether the elements are the same
//contains remove => equals()
    public static void main(String[] args){
      /*  ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java02");
        al.add("java01");
        System.out.println(al);
        al = singleElm(al);
        System.out.println(al);
      */

        ArrayList pal = new ArrayList();
        pal.add(new Person("hn",34));
        pal.add(new Person("ewfdew",35));
        pal.add(new Person("dwd",67));
        pal.add(new Person("erg",33));
        pal = singleElm(pal);
        Iterator iter = pal.iterator();
        while(iter.hasNext()){
           /* Object obj = iter.next();
            //向下转型
            Person p =(Person)obj;*/
           Person p = (Person)iter.next();
           System.out.println(p.getName()+"..."+p.getAge());
        }
     }
}
