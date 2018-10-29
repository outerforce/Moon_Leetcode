package leetcode;

import java.util.*;

/**
 * Created by somexoh on 2017/3/24.
 */
public class Robot {
    public static List<Integer> transition(String[] a) {
        List<Integer> la = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int num = Integer.parseInt(a[i].substring(0, 1));
            String direction = a[i].substring(1, 2);
            if (direction.equals("R")) {
                la.add(num);
            } else {
                la.add(-num);
            }
        }
        return la;
    }

    public static int meet(String[] a, String[] b) {
        List<Integer> la = transition(a);
        List<Integer> lb = transition(b);

        int pos1 = 0, pos2 = 0, count = 0;
        int min = Math.min(a.length, b.length);
        int max = Math.max(a.length, b.length);
        for (int j = 0; j < min; j++) {
            pos1 += la.get(j);
            pos2 += lb.get(j);
            if (pos1 == pos2) {
                count++;
            }
            //System.out.println(pos1+"..."+pos2);
        }
        for (int j = min; j < max; j++) {
            if (a.length < b.length) {
                pos2 += lb.get(j);
                if (pos1 == pos2) {
                    count++;
                }
                System.out.println(pos1 + "..." + pos2);
            }
            if (b.length < a.length) {
                pos1 += la.get(j);
                if (pos1 == pos2) {
                    count++;
                }
                System.out.println(pos1 + "..." + pos2);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String[] a = {"1L", "2R", "2R", "3L"};
        String[] b = {"1L", "2R", "3R", "3L", "2L", "3R", "2L", "1R", "1L"};
        //System.out.println(transition(a));
        //System.out.println(transition(b));
        int result = meet(a, b);
        System.out.println(result);
    }
}
