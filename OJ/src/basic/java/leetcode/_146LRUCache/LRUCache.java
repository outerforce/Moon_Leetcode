package basic.java.leetcode._146LRUCache;

/**
 * Created by Irene on 2018-02-12.
 */

/***
 * LRU Cache
 * Description
 *  Design and implement a data structure for Least Recently Used (LRU) cache.
 *  support operations: get and put.
    get(key) - Get the key value if the key exists in the cache, otherwise return -1.
    put(key, value) - Set or insert the value if the key is not already present.
    When the cache reached its capacity, it should invalidate the least recently
    used item before inserting a new item.
    ??? O(1) time complexity?
 Example:
 LRUCache cache = new LRUCache( 2 ); //capacity
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
 */




public class LRUCache {
    public LRUCache(int capacity) {
    }

    public int get(int key) {
    return -1;
    }

    public void put(int key, int value) {

    }

    public static void main(String[]args){
        LRUCache s=new LRUCache(2);

    }
}
