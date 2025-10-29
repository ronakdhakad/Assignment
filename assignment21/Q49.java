//1. Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;
import java.util.Scanner;
public class Q49 {
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
    }
}
