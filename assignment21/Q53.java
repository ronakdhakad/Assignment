// 5. Write a Java program to test if a hash set is empty or not.
package assignment21;
import java.util.HashSet;
import java.util.Scanner;
public class Q53 {
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
        set.clear();
        System.out.println("After clear hashSet: "+set); 
        System.out.println("Check set is Empty or not:   "+set.isEmpty());
    }
}