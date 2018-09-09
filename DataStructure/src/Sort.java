/**
 * @author created by Ying
 * Date: 2018-08-31
 */
public class Sort {
    public static void sort(String[] x) {
        //find the smallest item
        //move it to the front
        //selection sort the rest
       sort(x,0);
    }

    private static void sort(String[] x, int start) {
        if(start == x.length){
            return;
        }
        int smallIndex = findSmallest(x, start);
        swap(x, start , smallIndex);
        sort(x, start + 1);

    }
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    // return the index of the smallest string in x.
    public static int findSmallest(String[] x, int start) {
        int smallIndex = start;
        int len = x.length;
        for (int i = start; i < len; i++) {
            int cmp = x[i].compareTo(x[smallIndex]);
            if (cmp < 0) {
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void main(String[] args) {

    }
}
