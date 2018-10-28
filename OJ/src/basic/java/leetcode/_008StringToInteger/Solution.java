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
    public int myAtoi(String str) {
        int len = str.length();
        int i = 0, ans = 0, sign = 1;
        char[] chars = str.toCharArray();

        while (i < len && chars[i] == ' ') i++;
        if (i == str.length()) {return 0;}
        if (i < len && chars[i] == '-' || chars[i] == '+') {
            sign = chars[i++] == '+' ? 1 : -1;
        }
        for (; i < len; i++) {
            int tmp = chars[i] - '0';
            //System.out.println(tmp);
            if (tmp < 0 || tmp > 9)
                break;
            if ((Integer.MAX_VALUE - tmp)/10 < ans) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                ans = ans * 10 + tmp;
            }
        }
        return sign * ans;
    }
        public int myAtoi1(String str) {
            char [] chars = str.toCharArray();
            int len = chars.length;
            if(len == 0){return 0;}
            int sign = 1, res = 0;
            int i = 0;
            while(i < len && chars[i] == ' '){ i++;}
            if (i == str.length()) {return 0;}
            if(i < len && chars[i] == '+' || chars[i] == '-'){
                sign = chars[i++] == '+' ? 1 : -1;
            }
            for(; i < len; i++){
                int tmp = chars[i] - '0';
                if(tmp < 0 || tmp > 9){
                    break;
                }
                if(res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }else{
                    res = res * 10 + tmp;
                }
            }
            return res * sign;
        }


    public static void main(String[] params) {
        Solution s = new Solution();
        int res = s.myAtoi("    -41255    ");
        int res1 = s.myAtoi(" ");
        System.out.println(res);
    }
}
