//16. Write a Java program to remove a given element from a tree set.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        TreeSet<Integer> set=new TreeSet<>();
        
        set.add(6);
        set.add(3);
        set.add(7);
        set.add(8);
        set.add(2);
        set.add(9);
        
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
            System.out.println("TreeSet: "+set);
            set.remove(n);
            System.out.println("Removed Element: "+n);
            System.out.println("After removed "+n+" from the TreeSet: "+set);
    }
}
