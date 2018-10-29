package com.company;

import java.util.LinkedList;

/**
 * Created by somexoh on 2017/3/10.
 */

/* method:
add
remove can get element and delete it
get can get element
poll=> get and remove the first element null
peek=> get the element
offer=> add element
*/

//queue => pipe FIFO
class queue {
    private LinkedList link;

    queue() {
        link = new LinkedList();
    }

    public void add_elm(Object obj) {
        link.add(obj);
    }

    public Object get_elm() {
        return link.removeFirst();
    }

    public boolean isNull() {
        return link.isEmpty();
    }
}

//stack => like a cup FILO
class stack {
    LinkedList link;

    stack() {
        link = new LinkedList();
    }

    public void add_e(Object obj) {
        link.add(obj);
    }

    public Object get_e() {
        return link.removeLast();
    }

    public boolean isNull() {
        return link.isEmpty();
    }
}

public class linkedlist {


    public static void stack_implement() {
        LinkedList links = new LinkedList();


    }

    public static void main(String[] args) {
        /*LinkedList link = new LinkedList();
        link.add("java01");
        link.addFirst("java02");
        link.addLast("java09");
        link.removeFirst();
        System.out.print(link.getFirst());
        while (!link.isEmpty()) {
            System.out.print(link.removeFirst());
        }*/

        stack s = new stack();
        s.add_e("a");
        s.add_e("b");
        s.add_e("c");

        queue q = new queue();
        q.add_elm("java0");
        q.add_elm("java1");
        q.add_elm("java2");
        q.add_elm("java3");
        while (!q.isNull()) {
            System.out.println(q.get_elm());
        }
        while (!s.isNull()) {
            System.out.println(s.get_e());
        }
    }
}
