/**
 * @author created by Ying
 * Date: 2018-09-13
 */

// track and remove the smallest item in a priority queue
public interface MinPQ<Item> {
    public void add(Item i);

    public Item getSmallest();

    public Item removeSmallest();

    public int size();

}
