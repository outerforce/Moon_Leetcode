/**
 * @author created by Ying
 * Date: 2018-09-11
 */

//runtime analysis: O(N + M * alpha(N)) (M operations and size N of the object)
public class QuickFindDS implements DisjointSets{
    private int[] parent;
    private int[] size;

    //WeightQuickFindDSPathCompression
    public QuickFindDS (int N){
        parent = new int[N];
        size = new int[N];
        for(int i = 0; i < N; i++){
            parent[i] = i;
            size[i] = i;
        }
    }

    private int find(int p){
        if ( p == parent[p]){
            return p;
        }else {
            parent[p] = find(parent[p]);
            return parent[p];
        }
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void connect(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i==j) return;
        if(size[i] < size[j]){
            parent[i] = j;
            size[j] += size[i];
        }else {
            parent[j] = i;
            size[i] += size[j];
        }
    }
//    public QuickFindDS(int N){
//        id = new int[N];
//        for(int i = 0; i < N; i++){
//            id[i] = i;
//        }
//    }
//    public boolean isConnected(int p, int q){
//        return id[p] == id[q];
//    }
//     public void connect(int p, int q){
//        int pid = id[p];
//        int qid = id[q];
//        for(int i = 0; i<id.length; i++){
//            if(id[i] == pid){
//                id[i] = qid;
//            }
//        }
//     }
}
// an array to denote the group number of the number
//use tree to denote parent of the set and union two trees by weight, the size of the tree