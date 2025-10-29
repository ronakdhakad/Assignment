//4. Write a Java program to empty an hash set.
package assignment21;
import java.util.HashSet;
import java.util.Scanner;
public class Q52 {
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
    }
}