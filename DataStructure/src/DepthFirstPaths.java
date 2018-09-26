/**
 * @author created by Ying
 * Date: 2018-09-14
 */
public class DepthFirstPaths {
    private boolean[] marked;  //marked[v] = true if v is connected to s
    private int[] edgeTo; //edgeTo[v] is previous vertex on path from s to v
    private int s;

    public DepthFirstPaths(Graph G, int s){
        dfs(G, s);
    }

    private void dfs(Graph G, int v){
        marked[v] = true;
        for(int w : G.adj(v)){
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }
}
