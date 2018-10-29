package leetcode;

/**
 * Created by somexoh on 2017/3/18.
 */
public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
       // if (n == 1) return true;
        if (n <= 0) return false;
        String i = Integer.toBinaryString(n);
        char[] arr = i.toCharArray();
        int j = 1;
        if (arr[0] == '1' && arr.length > 1) {
            while (j < arr.length) {
                if (arr[j] == '1')
                    return false;
                else j++;
            }
        }
        return true;
    }

    //&
    public static boolean isPowerOfTwo2(int n) {
        if (n <= 0) return false;
        int flag = n & (n-1);
        if (flag == 0){
            return true;
        } else{
        return false;
        }
    }
    //bitCount
    public static boolean isPowerOfTwo3(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo3(5));
    }
}
