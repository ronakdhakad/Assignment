//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
public class Q1 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("blue");
        set.add("pink");
        set.add("gray");
        set.add("orange");
        set.add("yellow");
        System.out.println("TreeSet: "+set);
    }
}
