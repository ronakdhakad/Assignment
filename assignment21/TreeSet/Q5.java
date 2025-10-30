//5. Write a Java program to get the first and last elements in a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q5 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("white");
        set.add("pink");
        set.add("gray");
        set.add("orange");
        set.add("yellow");
        System.out.println("set: "+set);
        System.out.println("First element: "+set.first());
        System.out.println("Last element: "+set.last());
       
    }
}
