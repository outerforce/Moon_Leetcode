package basic.java.leetcode._008StringToInteger;

/**
 * Created by Irene on 2018-02-01.
 */

/***
 * String to Integer Atoi
 * Description
   Implement atoi to convert a string to an integer.
   先去除最前面的空格，然后判断正负数，注意正数可能包含 +，
   如果之后存在非数字或全为空则返回 0，而如果合法的值超过
   int 表示的最大范围，则根据正负号返回 INT_MAX 或 INT_MIN
 */
public class Solution {
    public int myAtoi(String str){
        int length = str.length();
        int i = 0, ans = 0, sign = 1;
        while(i< length && str.charAt(i) == ' ') i++;
        if( i < length )

    }

    public static void main(String[] params){

    }
}
