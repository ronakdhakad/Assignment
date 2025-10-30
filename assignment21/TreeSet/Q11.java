//11. Write a Java program to get the element in a tree set less than or equal to the given element.
package assignment21.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

//headSet()
public class Q11 {
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
        for(Integer i:set){
            if(i<=n){
                System.out.print(" "+i);
            }
        }
        System.out.println("");
    }
}
