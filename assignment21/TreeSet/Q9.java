//9. Write a Java program to find numbers less than 7 in a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;

//headSet()
public class Q9 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(6);
        set.add(3);
        set.add(7);
        set.add(8);
        set.add(2);
           set.add(9);
           System.out.println("TreeSet: "+set);
        System.out.print("Less than 7 elements  in TreeSet:");
        for(Integer i:set){
            if(i<7){
                System.out.print(" "+i);
            }
            
        }
        System.out.println("");
    }
}
