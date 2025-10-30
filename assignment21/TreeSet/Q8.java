//8. Write a Java program to compare two tree sets.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;


public class Q8 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(42);
        set.add(23);
        set.add(75);
        set.add(8);
        set.add(92);
        
        System.out.println("set1: "+set);
           TreeSet<Integer> set2=new TreeSet<>();
         set2.add(42);
        set2.add(23);
        set2.add(75);
        set2.add(8);
        set2.add(92);
//        set2.add(9);
        
        System.out.println("set2: "+set2);
//           Collections.
        System.out.println("Compare two TreeSet : "+set.containsAll(set2));
        
        System.out.println("Compare two TreeSet in size: "+set.equals(set2));
    }
}
