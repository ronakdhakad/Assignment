//3. Write a Java program to get the number of elements in a hash set.
package assignment21;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Q51 {
    public static void main(String[] args) {
        
        HashSet<String> set =new HashSet<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data into HashSet: ");
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        set.add(sc.nextLine());
        
        System.out.println("HashSet: "+set);
        Iterator itr =set.iterator();
        int i=1;
        while(itr.hasNext()){
            itr.next();
            i++;
        }
        System.out.println("Number of elements: "+i);
        System.out.println("Using size method:   "+set.size());
    }
}