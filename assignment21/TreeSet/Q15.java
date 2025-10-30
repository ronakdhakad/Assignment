//15. Write a Java program to retrieve and remove the last element of a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        TreeSet<Integer> set=new TreeSet<>();
        set.add(6);
        set.add(3);
        set.add(7);
        set.add(8);
        set.add(2);
        set.add(9);
       
            System.out.println("TreeSet: "+set);
            System.out.println("Last Element: "+set.pollLast());
            System.out.println("After retrive and remove the last element of TreeSet: "+set);
    }
}
