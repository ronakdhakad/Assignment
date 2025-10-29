//12. Write a Java program to remove all elements from a hash set.
package assignment21;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Q60 {
    public static void main(String[] args) {
        
        HashSet<Integer> set =new HashSet<>();
        System.out.println("Enter data into HashSet: ");
        set.add(32);
        set.add(-5);
        set.add(9);
        set.add(4);
        set.add(8);
        set.add(566);
         System.out.println("HashSet set1: "+set);
        set.removeAll(set);
         System.out.println("Remove all elements in hashset: "+set);
        }
    }
