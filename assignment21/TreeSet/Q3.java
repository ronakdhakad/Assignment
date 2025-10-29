//3. Write a Java program to add all the elements of a specified tree set to another tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("white");
        set.add("pink");
        set.add("gray");
        set.add("");
        set.add("yellow");
        
        TreeSet<String> set2 =new TreeSet<>();
        System.out.println("set1: "+set);
        set2.add("red");
        set2.add("black");
        set2.add("white");
        System.out.println("set2: "+set2);
        set2.addAll(set);
        System.out.println("After adding set1 in set2: "+set2);
    }
}
