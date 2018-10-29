package com.company;
import java.util.*;
/**
 * Created by somexoh on 2017/3/14.
 */

/*
interface Map {
    public static interface Entry{
        public abstract Object getKey();
        public abstract Object getValue();
    }
}

public class map_entry implements Map{
    class Hahs implements Map.Entry{
        public Object getKey(){return 1;}
        public Object getValue(){return 0;}
    }
}
*/
class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Employee s){
        int num = new Integer(this.age).compareTo(new Integer(s.age));
        if(num == 0)
            return this.name.compareTo(s.name);
        return num;
    }
    public int hashCode(){
        return name.hashCode()+age*34;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name + age ;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Employee))
            throw new ClassCastException("object type not matched");
        Employee s = (Employee)obj;
        return this.name.equals(s.name) && this.age == s.age;
    }
}
public class MapDemo {
    public static void main(String[] args){
        Map<Employee, String> hm = new HashMap<Employee, String>();
        hm.put(new Employee("amber",21),"beijing");
        hm.put(new Employee("ben",25),"shanghai");
        hm.put(new Employee("carol",33),"wuhan");
        hm.put(new Employee("din",24),"shenzhen");
        //Set<Employee> keyset = hm.keySet();
        //keyset
        Iterator<Employee> iter = hm.keySet().iterator();
        while(iter.hasNext()){
            Employee e = iter.next();
            String address = hm.get(e);
           // System.out.println(address+"..."+e.getName()+"..."+e.getAge());
        }
        //entryset
        Set<Map.Entry<Employee,String>> entries = hm.entrySet();
        Iterator<Map.Entry<Employee,String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<Employee,String> m = it.next();
            Employee e = m.getKey();
            String adr = m.getValue();
            System.out.println(e.getName()+"..."+e.getAge()+"..."+adr);

        }


    }
}

