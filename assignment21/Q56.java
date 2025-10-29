//8. Write a Java program to convert a hash set to a tree set.
package assignment21;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Q56 {
    public static void main(String[] args) {
        
        HashSet<String> set =new HashSet<>();
        System.out.println("Enter data into HashSet: ");
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        
        System.out.println("HashSet: "+set);
        
        TreeSet<String> ts =new TreeSet<>(set);
        
        System.out.println("TreeSet: "+ts);
    }
}