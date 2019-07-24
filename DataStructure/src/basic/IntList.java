/**
 * @author created by Ying
 * Date: 2018-08-31
 */

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        int totalsize = 0;
        IntList p = this;
        while (p != null) {
            totalsize += 1;
            p = p.rest;
        }
        return totalsize;
    }

    public int get(int x) {
        if (x == 0) {
            return first;
        }
        return rest.get(x - 1);
    }

    public static IntList IncrList(IntList L, int x) {
        int last = L.size() - 1;
        IntList incr = new IntList(L.get(last) + x, null);
        for (int i = last - 1; i >= 0; i--) {
            incr = new IntList(L.get(i) + x, incr);
        }
        return incr;
    }

/*        public static IntList DicrList(IntList L, int x){
        int last = L.size();
        for(int i = 1; i < last; i++){
            L.first += x;

        }
        return L;
    }*/
    public static void main(String args[]) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());
//        System.out.println(L.get(1));
        System.out.println(IncrList(L, 3).get(2));
//        IntList result = DicrList(L,3);
//        System.out.println(result.get(0));
//        System.out.println(result.get(1));
//        System.out.println(result.get(2));
    }
}
