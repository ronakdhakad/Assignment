//6. Write a Java program to clone a hash set to another hash set.
package assignment21;
import java.util.HashSet;
import java.util.Scanner;
public class Q54 {
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
        System.out.println("Clone HashSet: "+set.clone());
        HashSet<String> set1=new HashSet<>(set);
        System.out.println("HashSet Clone using Another Object: "+set1);
        
    }
}