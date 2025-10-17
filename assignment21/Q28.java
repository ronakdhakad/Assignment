// 6. Write a Java program to insert elements into the linked
//    list at the first and last positions 
import java.util.LinkedList;
import java.util.Scanner;
public class Q28 {
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
        String n1=sc.nextLine();
        System.out.println("Enter second position element: ");
        String n2=sc.nextLine();
System.out.println();
        list.add(0,n1);
        list.add(list.size(),n2);
        System.out.println("Adding last and fist position element "+list);
        System.out.println();
    }
}