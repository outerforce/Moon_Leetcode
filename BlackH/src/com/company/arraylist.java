package com.company;
import java.util.*;
/**
 * Created by somexoh on 2017/3/10.
 */
//collection all elem contains the address of objects, similarity of collection
public class arraylist {
    public static void method_get(){
        ArrayList al = new ArrayList();
        al.add("ttt");
        al.add(true);
        System.out.println(al);
        Iterator iter = al.iterator();
        // iterator: get element of collection

        while(iter.hasNext()){
            Object obj = iter.next();
            while(obj.equals("java02")){
                al.remove(obj);
            }
            System.out.println(obj);
        }
        //only for list collection, index !!!
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            Object obj = li.next();
            if(obj.equals("java02")){
                li.add("java06");
                li.set("java08");
            }
        }
       /* for(Iterator it = al.iterator(); it.hasNext();){
            System.out.println(iter.next());
        }*/
    }
    //List: duplicate, order, index => ArrayList & LinkedList & Vector
        //=> add(index, elem), remove(), set(ind, elem),
        // get(), subList(from, to), listIterator();

    //set: no duplicate , no order => HashSet, TreeSet
    public static void List_method(){
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add(1, "java09");

    }
    //enumeration similar as iterator
    public static void vector_method(){
        Vector v = new Vector();
        v.add("001a");
        v.add("002a");
        v.add("003a");
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement());
        }

    }
    /* ArrayList: dynamic array => search fast; insert&delete slow; add lock to implement synchronization
       LinkedList: doubly linked list => search slow; insert&delete fast
       Vector: array => same as ArrayList; vector is thread synchronized
     */
    public static void main(String [] args){
        method_get();
       System.out.println();
    }
}
