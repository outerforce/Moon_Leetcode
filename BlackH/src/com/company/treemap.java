package com.company;

import java.util.*;

/**
 * Created by somexoh on 2017/3/15.
 */
class EmpNameComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        int num = e1.getName().compareTo(e2.getName());
        if(num == 0){
            return new Integer(e1.getAge()).compareTo(new Integer(e2.getAge()));
        }
        return num;
    }
}
public class treemap{
    public static void main(String[] args){
        TreeMap<Employee, String> tm = new TreeMap<Employee,String>(new EmpNameComparator());
        tm.put(new Employee("amber",21),"beijing");
        tm.put(new Employee("ben",25),"shanghai");
        tm.put(new Employee("carol",33),"wuhan");
        tm.put(new Employee("din",24),"shenzhen");
        tm.put(new Employee("din",24),"tanjin");
        tm.put(new Employee("din",24),"tanjin");
        Set<Map.Entry<Employee,String>> es = tm.entrySet();
        Iterator<Map.Entry<Employee,String>> iter = es.iterator();
        while (iter.hasNext()){
            Map.Entry<Employee,String> me = iter.next();
            String adr = me.getValue();
            Employee e = me.getKey();
            System.out.println(e+"..."+adr);
        }
    }
}
