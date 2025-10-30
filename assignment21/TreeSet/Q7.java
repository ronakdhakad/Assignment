//7. Write a Java program to get the number of elements in a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q7 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(42);
        set.add(23);
        set.add(75);
        set.add(8);
        set.add(92);
        
        System.out.println("set: "+set);
        System.out.println("TreeSet size: "+set.size());
    }
}
