/**
 * @author created by Ying
 * Date: 2018-09-11
 */
public interface DisjointSets {
    public void connect(int p, int q);
    public boolean isConnected(int p, int q);
}
