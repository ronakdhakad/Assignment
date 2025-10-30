//13. Write a Java program to get an element in a tree set that has a lower value than the given element.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q13 {
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
            System.out.print("Elements which is less than or equals to "+n+" is :");
            Integer le=set.lower(n);
            System.out.println(le);
    }
}
