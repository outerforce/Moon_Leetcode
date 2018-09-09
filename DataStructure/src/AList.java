/**
 * @author created by Ying
 * Date: 2018-08-31
 */

//generic cast object
public class AList<Item> implements List61B<Item> {
    private Item[] items;
    private int size;

    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        ;
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    @Override
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size++;
    }
    @Override
    public Item getLast() {
        return items[size - 1];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    @Override
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null; // set the pointer to null to allow the garbage collection work
        size--;
        return x;
    }

    public void insert(Item a, int x){}

    public void addFirst(Item x){}

    public int getFirst(){ return 0; }
}

