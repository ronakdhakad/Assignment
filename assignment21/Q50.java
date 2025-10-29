//2. Write a Java program to iterate through all elements in a hash list.
package assignment21;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Q50 {
    public static void main(String[] args) {
        
        HashSet<String> set =new HashSet<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data into HashSet: ");
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        
        System.out.println("HashSet: "+set);
        Iterator itr =set.iterator();
        System.out.println("HashSet list using Iterator");
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println("");
    }
}