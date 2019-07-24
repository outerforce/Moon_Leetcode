/**
 * @author created by Ying
 * Date: 2018-09-04
 */
public interface List61B<Item>{

    //private void resize(int capacity);
    public void addFirst(Item x);

    public void addLast(Item x);

    public int getFirst();

    public Item getLast();

    public Item get(int i);

    public int size();

    public Item removeLast();

    public void insert(Item x, int position);
}
