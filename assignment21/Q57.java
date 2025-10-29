//9. Write a Java program to find numbers less than 7 in a hash set.
package assignment21;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Q57 {
    public static void main(String[] args) {
        
        HashSet<Integer> set =new HashSet<>();
        System.out.println("Enter data into HashSet: ");
        set.add(32);
        set.add(-5);
        set.add(9);
        set.add(4);
        set.add(8);
        set.add(566);
        set.add(7);
        set.add(1);
        set.add(-12);
        
        System.out.println("HashSet: "+set);
       for(Integer num:set){
           if(num<7)
           System.out.println(num);
       }
        }
    }
