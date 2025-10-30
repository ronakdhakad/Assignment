//12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;


public class Q12 {
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
        System.out.print("Elements which is greater than or equals to "+n+" is :");
        Integer i=set.ceiling(n);
        System.out.println("Ceiling : "+i);
    }
}
