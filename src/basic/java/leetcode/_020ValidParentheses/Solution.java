package basic.java.leetcode._020ValidParentheses;

import java.util.Stack;


/**
 * Created by Irene on 2018-02-01.
 */


/***
 * Valid Parentheses
 * Description
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.
 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
//Tags: Stack, String

public class Solution {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if ("({[".contains(String.valueOf(c))) {
                stack.push(c);
            } else {
                if (!stack.empty() && isValid(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean isValid(char c1, char c2) {
        return (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}');
    }

    public boolean isValidParentheses1(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "[]{[][]{}{}{}}";
        String s2 = "[{}{}{}))))";
        boolean flag = s.isValidParentheses(s1);
        System.out.println(flag);
    }
}
