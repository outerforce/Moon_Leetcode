package com.leetcode;

import java.util.*;

/**
 * Created by somexoh on 2017/3/18.
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int i) {
        stack.push(i);
        if (minStack.empty() == true) {
            minStack.push(i);
        } else {
            if (minStack.peek() >= i) {
                minStack.push(i);
            }
        }
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
