import java.util.Comparator;

/**
 * @author created by Ying
 * Date: 2018-09-07
 */

//size compare and string compare
/*
    public interface Comparator<T>{
        int compare(){
        }
}*/


public class Dog implements Comparable<Dog>{
    private String name;
    private int size;

    public Dog(String n, int s){
        name = n;
        size = s;
    }

    public void bark(){
        System.out.println(name + "says:bark");
    }

    // return negative if this dog is less than the given dog
    public int compareTo(Dog uddaDog){
        return this.size - uddaDog.size;
    }

    private static class nameComparator implements Comparator<Dog>{
        public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new nameComparator();
    }
}
