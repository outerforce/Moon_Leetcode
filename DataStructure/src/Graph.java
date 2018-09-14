/**
 * @author created by Ying
 * Date: 2018-09-13
 */
public class Graph {
    public Graph(int V){

    }
    public void addEdge(int v, int w) {

    }
    Iterable<Integer> adj(int v){

    }
    int V(); //# of vertices
    int E(); // # of edges
    public static int degree(Graph G, int v){
        int degree = 0;
        for(int w : G.adj(v)){
            degree++;
        }
        return degree;
    }
}

