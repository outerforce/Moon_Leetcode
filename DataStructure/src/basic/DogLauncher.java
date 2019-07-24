import java.util.Comparator;

/**
 * @author created by Ying
 * Date: 2018-09-07
 */

public class DogLauncher {
    public static void main(String[] args){
        Dog d1 = new Dog("elysee",3);
        Dog d2 = new Dog("sture",9);
        Dog d3 = new Dog("ben",15);
        Dog[] dogs = new Dog[]{d1,d2,d3};
        System.out.println();
        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1,d3) > 0){
            d1.bark();
        } else {
            d3.bark();
        }
    }
}
