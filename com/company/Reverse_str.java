package com.company;

public class Reverse_str {
    public static String reverseStr(String s) {
        char[] ch = s.toCharArray();
        //reverse(ch);
        //int j = ch.length - 1;
     /*   for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }*/
        int start = 0, end = ch.length - 1;
        char temp;
        while (start < end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    //key in s times
    public static int getsubcount(String s, String key) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(key, index)) != -1) {
            index = index + key.length();
            count++;
        }
        return count;
    }

    //longest common str
    public static String LCS(String s1, String s2) {
        //get longest str s1:s2
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0, k = s2.length() - i; k != s2.length() + 1; j++, k++) {
                String temp = s2.substring(j, k);
                if (s1.contains(temp))
                    return temp;
            }
        }
        return "";
    }
    //String buffer: modify string  thread synchronized, safer
    // =>a container with dynamic size and multi data types
    // an string builder use : toString()
    //append, delete(start,end) deleteCharAt(index)
    //replace(start, end, str) reverse()
    public static void delete_meth(){
        StringBuffer sb = new StringBuffer("avkfen");
        //sb.delete(1,3);
        sb.replace(1,3,"hh");
        //clear buffer
        // sb.delete(0, sb.length());
        //sb.deleteCharAt(2);
        System.out.print(sb.toString());
    }
    //StringBuilder: non thread-synchronized, faster
    //same as StringBuffer


    public static void main(String[] args) {
        // write your code here
        String s = "   afg ewd kk kk kk kk   ";
        String key = "kk";
        //sb == sb2 true
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append(34).append(true).insert(1,"qq");
        char[] ch = new char[4];
        sb.getChars(1,4,ch,0);
        for(int i = 0; i < ch.length;i++){
            System.out.println(ch[i]);
        }
       // System.out.println(sb.toString());
        System.out.println(sb2.toString());
        delete_meth();

       // System.out.print(reverseStr(s));
       // System.out.print(getsubcount(s, key));
    }
}
