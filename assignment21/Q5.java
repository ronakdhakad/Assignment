// 5. Write a Java program to update an array element by the given element.
import java.util.Scanner;
import java.util.ArrayList;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        // System.out.println();
        ArrayList <String> list=new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("orignal list....");
        System.out.println(list);

        System.out.println("Enter index of list");
        int index=sc.nextInt();
        sc.nextLine();
        System.out.println("Add an Element: ");
        String s=sc.nextLine();
        list.add(index,s);

        System.out.println("updated list....");
        System.out.println(list);
    }
}
