package com.company;
import java.util.*;

/**
 * Created by somexoh on 2017/3/10.
 */

/*set: no order; no duplicate
    * same as collection
    * HashSet=> HashTable  uniqueness add and remove
    *       =>1. hashcode 2.equals() hashCode same=>equals() overwrite equals()
    *       non synchronized
    *
    * ArrayList => equals
    * TreeSet=> Tree
    *
*/

class People{
    private String name;
    private int age;

    People(String name, int age){
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
        if(!(obj instanceof People)){
            return false;
        }
        People p = (People)(obj);
        System.out.println(this.name+"...equals..."+p.getName());
        return this.name.equals(p.name) && this.age == p.age;
    }
    //overwrite hashCode in Object class
    public int hashCode(){
        System.out.println(this.name+"...hashcode...");
        return name.hashCode()+age*37;
    }

}

public class hashset {

    public static void main(String[] args){
            HashSet hs = new HashSet();
            hs.add(new People("a1",12));
            hs.add(new People("a2",13));
            hs.add(new People("a4",15));
            hs.add(new People("a4",15));

           /* hs.add("java01");
            hs.add("java02");
            hs.add("java03");
            hs.add("java04");*/
           System.out.println(hs.contains(new People("a1",12)));

            Iterator iter = hs.iterator();
            while(iter.hasNext()){
                People p = (People)iter.next();
                System.out.println(p.getName()+"...."+p.getAge());
            }
    }
}
