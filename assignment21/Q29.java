// 7. Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class Q29{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        list.add("atul");
        list.add("ronak");
        list.add("sohan");
        list.add("meherban");
        list.add("nishant");
        list.add("shaksham");
        
        System.out.println("Orignal List: "+list);
        System.out.println();
        System.out.println("Enter first position element: ");
        String n=sc.nextLine();
System.out.println();
        list.addFirst(n);
        System.out.println("Adding element "+n+" at first positin: "+list);
        System.out.println();
    }
}