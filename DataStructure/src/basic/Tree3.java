/**
 * @author created by Ying
 * Date: 2018-09-13
 */

/**
 * Tree representation
 * 1. sibling links
 *      1a. (key, left, middle, right)
 *      1b. parent reference to an array of child links
 *      1c. sibling links
 * 2. array of Keys, array of structure int[] parents, Key[]
 * 3. array of Keys
 */
public class Tree3<Key> {
    Key[] keys;

    public int parent(int k){
        return (k-1)/2;
    }

  /*  public void swim(int k){
        if(keys[parent(k)] > keys[k]){
            swap(k, parent(k));
            swim(k, parent(k));
        }
    }*/
}
