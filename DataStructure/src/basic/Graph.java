import java.util.ArrayList;
import java.util.List;

/**
 * @author created by Ying
 * Date: 2018-09-13
 */
public class Graph {
    private final int V;
    private List<Integer>[] adj;
    public Graph(int V){
        this.V = V;
        adj = (List<Integer>[]) new ArrayList[V]; //cannot create array of generics, must cast
        for(int v = 0; v < V; v++){
            adj[v] = new ArrayList<Integer>();
        }
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    Iterable<Integer> adj(int v){
        return  adj[v];
    }
    /*int V(); //# of vertices
    int E(); // # of edges*/
    public static int degree(Graph G, int v){
        int degree = 0;
        for(int w : G.adj(v)){
            degree++;
        }
        return degree;
    }
}

