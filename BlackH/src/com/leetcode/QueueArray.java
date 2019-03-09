package com.leetcode;
import java.util.*;
/**
 * Created by somexoh on 2017/3/18.
 */

public class QueueArray {
    private Object[] arr;
    private int size;
    private int head,rear;

    //default size = 10
    public QueueArray(int maxsize){
        this.size = maxsize;
        this.arr = new Object[size];
        this.head = 0;
        this.rear = 0;
    }
    //get the size of the queue
    public int getSize(){
        if(this.head < this.rear){
            return this.rear-this.head;
        }else if(this.head > this.rear){
            //circular queue
            return size - this.head + this.rear;
        }else{
            if(this.arr[this.head] ==null){
                return 0;
            }else {
                return this.size;
            }
        }
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }
    public boolean isFull(){
        return getSize() == this.size;
    }
    public void add(Object a){
        if(isFull() == true){
            throw new RuntimeException("QUEUE IS FULL");
        }else{
        this.arr[this.rear] = a;
        this.rear = (this.rear+1 )% this.size;
    }
    }
   //public int offer(int a){}

    public Object remove(){
       if(isEmpty() == true){
           return null;
       }else{
           Object first = this.arr[this.head];
           this.head = (this.head +1) % this.size;
           return first;
       }
    }
    //public int poll(){}

    public Object peek(){
        if(isEmpty() == true){return null;}
        else {return this.arr[this.head];}
    }

    public String toString(){
        String s = "";
        int pointer =  this.head;
        //print every element in the queue
        if(isEmpty() == false){
            for (int i=1;i<=getSize();i++){
                s += "["+arr[pointer].toString()+"]";
                pointer = (pointer+1) % this.size;
            }
            //new line and indent
            s += "\n\t";
            //add information about current queue size, front and rear
            s += "The current size of the quence is " + getSize() + ".";
            s += "The front is at index " + this.head + " and the rear is at index " + this.rear + ".";
        }else{
            s += "The queue is empty...";
        }
        return s;
    }
    //public int element(){}
    public static void main(String[] args){
        QueueArray q = new QueueArray(10);
        q.add("1dw");
        q.add("2dw");
        q.add("3dw");
        System.out.println(q.getSize());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.toString());
    }
}
